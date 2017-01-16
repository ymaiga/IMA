public class MainClass{

	public static void main(String[] args){

		List<String> args_0 = new ArryList<String>();
		//debut parcours du chemin0 (id = 0)
		args_0.add(Ali);
		args_0.add(newHashtag);
		if ( LibTw.getTwittes(args_0)>20){
			LibTw.plot(LibTw.getTwittes(args_0));
		}
		else{
			LibTw.print(LibTw.getTwittes(args_0));
		}
		String req_0 = LibTw.getTwittes(args_0);


		List<String> args_1 = new ArryList<String>();
		//debut parcours du chemin1 (id = 1)
		args_1.add(ESIR);
		LibTw.positifTw(LibTw.getTwittes(args_1));
		LibTw.print(LibTw.getTwittes(args_1));
		String req_1 = LibTw.getTwittes(args_1);


	}

}
