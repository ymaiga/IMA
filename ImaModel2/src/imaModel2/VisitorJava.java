package imaModel2;

public class VisitorJava {

private String args;

 public VisitorJava(String args) {
	super();
	this.args = args;
}

public String visite(Filtre f){
	return args+".add("+f.getName()+");\n"; 
 }
 
 public String visite(Action a){
	return "//Action\n";
 }
 
 public String visite(Noeud n){
	return "//Noeud\n";
 }
 
 public String visite(Print p){
	 String res = "LibTw.getTwittes("+args+")";
	return "System.out.println("+res+");\n"; 
 }
 
 public String visite(Plot p){
	 String res = "LibTw.getTwittes("+args+")";
	return "LibTw.plot("+res+");\n"; 
 }
 
 public String visite(AVG_Like avg){
	 String res = "LibTw.getTwittes("+args+")";
	return "LibTw.avgLike("+res+");\n"; 
 }
 
 public String visite(Negatif neg){
	 String res = "LibTw.getTwittes("+args+")";
	return "LibTw.negatifTw("+res+");\n"; 
 }
 
 public String visite(Positif pos){
	 String res = "LibTw.getTwittes("+args+")";
	return "LibTw.positifTw("+res+");\n"; 
 }
 
 public String visite(Followers fl){
	 String res = "LibTw.getTwittes("+args+")";
	return "LibTw.nbFollowers("+res+");\n"; 
 }
 
 public String visite(Condition cnd){
	 String res = "if ( LibTw.getTwittes("+args+")"+cnd.getOperator()+"){\n";
	 res+=cnd.getIf().acceptVisitor(this)+"}\n else{\n"+cnd.getElse().acceptVisitor(this)+"}\n";
	return res;
 }
 
 public String visite(Condition cnd, Noeud n){
	 String strcnd = getCondition(n);
	 String res = "if ("+strcnd+" "+cnd.getOperator()+"){\n";
	 res+=cnd.getIf().acceptVisitor(this)+"}\n else{\n"+cnd.getElse().acceptVisitor(this)+"}\n";
	return res;
 }

private String getCondition(Noeud n) {
	String res = "";
	if(n instanceof Filtre){
		res = "LibTw.count("+args+")";
	}
	else {
		String tmp = n.acceptVisitor(this);
		int ind = tmp.lastIndexOf(";");
		if(ind >=0){
			res = tmp.substring(0, ind);
		}
		else res =tmp;
	}
	return res;
}
 
}
