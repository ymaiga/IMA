package esir3.im.libs;

import java.util.Date;

public class TweetIma {
	


	public TweetIma(Date date, String text) {
		super();
		this.date = date;
		this.text = text;
	}

	private Date date;
	
	private String text;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "{" + date + "#" + text + "}\n";
	}

	
	
	


}
