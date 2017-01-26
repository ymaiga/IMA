package esir3.im.libs;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class PlotIma extends Canvas {


	public static void plot(List<String> data)
	{
		if(data.size() == 0)
		{
			return;
		}
		
		StringBuilder req = new StringBuilder("date <-c(");
		
		for(int i =0;i<data.size();i++)
		{
			req.append("\"").append(data.get(i)).append("\"");

			if(i!=data.size()-1)
			{
				req.append(",");
			}
		}

		req.append(");");


		System.out.println(req);

		try {
			String device = "jpeg"; 

			RConnection c = new RConnection("127.0.0.1");

			REXP xp = c.parseAndEval("try("+device+"('test.jpg',quality=90))");

			if (xp.inherits("try-error")) { 
				System.err.println("Can't open "+device+" graphics device:\n"+xp.asString());
				REXP w = c.eval("if (exists('last.warning') && length(last.warning)>0) names(last.warning)[1] else 0");
				if (w.isString()) System.err.println(w.asString());
				return;
			}

			c.parseAndEval(req.toString());
			c.parseAndEval("set.seed(1);barplot(table(date)); dev.off()");

			xp = c.parseAndEval("r=readBin('test.jpg','raw',1024*1024); unlink('test.jpg'); r");

			Image img = Toolkit.getDefaultToolkit().createImage(xp.asBytes());

			Frame f = new Frame("ESIR3 IMA TW ");
			f.add(new PlotIma(img));
			f.addWindowListener(new WindowAdapter() { 
				public void windowClosing(WindowEvent e) { System.exit(0); }
			});
			f.pack();
			f.setVisible(true);

			c.close();
		} catch (RserveException rse) { 
			System.out.println(rse);
		} catch (REXPMismatchException mme) { 
			System.out.println(mme);
			mme.printStackTrace();
		} catch(Exception e) { 
			System.out.println("Something went wrong, but it's not the Rserve: "
					+e.getMessage());
			e.printStackTrace();
		}
	}

	Image img;

	public PlotIma(Image img) {
		this.img=img;
		MediaTracker mediaTracker = new MediaTracker(this);
		mediaTracker.addImage(img, 0);
		try {
			mediaTracker.waitForID(0);
		} catch (InterruptedException ie) {
			System.err.println(ie);
			System.exit(1);
		}
		setSize(img.getWidth(null), img.getHeight(null));
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
