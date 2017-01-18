import java.util.List;
import java.util.ArrayList;
import esir3.ima.LibTw;


public class MainClass{

	public static void main(String[] args){

		List<String> args_0 = new ArrayList<String>();
		//debut parcours du chemin0 (id = 0)
		args_0.add("@Ali");
		args_0.add("!newHashtag");
		if (LibTw.count(args_0) >20){
			LibTw.plot(LibTw.getTwittes(args_0));
		}
		else{
			System.out.println(LibTw.getTwittes(args_0));
		}
		List<String> req_0 = LibTw.getTwittes(args_0);


		List<String> args_1 = new ArrayList<String>();
		//debut parcours du chemin1 (id = 1)
		args_1.add("#ESIR");
		LibTw.positifTw(LibTw.getTwittes(args_1));
		if (LibTw.positifTw(LibTw.getTwittes(args_1)) >=100){
			System.out.println(LibTw.getTwittes(args_1));
		}
		else{
			LibTw.nbFollowers(LibTw.getTwittes(args_1));
		}
		List<String> req_1 = LibTw.getTwittes(args_1);


	}

}
