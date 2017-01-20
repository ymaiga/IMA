import java.util.List;
import java.util.ArrayList;
import esir3.ima.LibTw;


public class MainClass{

	public static void main(String[] args){
		LibTw libTw = new LibTw();

		List<String> args_0 = new ArrayList<String>();
		//debut parcours du chemin0 (id = 0)
		args_0.add("@Ali");
		args_0.add("!newHashtag");
		if (libTw.count(args_0) >20){
			libTw.plot(libTw.getTweets(args_0));
		}
		else{
			System.out.println(libTw.getTweets(args_0));
		}
		List<String> req_0 = libTw.getTweets(args_0);


		List<String> args_1 = new ArrayList<String>();
		//debut parcours du chemin1 (id = 1)
		args_1.add("#ESIR");
		libTw.positifTw(libTw.getTweets(args_1));
		if (libTw.positifTw(libTw.getTweets(args_1)) >=100){
			System.out.println(libTw.getTweets(args_1));
		}
		else{
			libTw.nbFollowers(libTw.getTweets(args_1));
		}
		List<String> req_1 = libTw.getTweets(args_1);


	}

}
