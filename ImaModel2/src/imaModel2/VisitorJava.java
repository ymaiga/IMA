package imaModel2;

public class VisitorJava {
 public String visite(Filtre f,String list){
	return list+".add("+f.getName()+");"; 
 }
 
 public String visite(Action a,String list){
	return "//Action\n";
 }
 
 public String visite(Noeud n,String list){
	return "//Noeud\n";
 }
 
 public String visite(Print p,String list){
	 String res = "LibTw.getTwittes("+list+")";
	return "LibTw.print("+res+");"; 
 }
}
