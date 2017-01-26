package imaModel2;

public class VisitorJava {

private String args;

 public VisitorJava(String args) {
	super();
	this.args = args;
}

public String visite(Filtre f){
	return args+".add(\""+f.getName()+"\");\n"; 
 }

public String visite(Hashtag h){
	return args+".add(\"#"+h.getName()+"\");\n"; 
 }

public String visite(User u){
	return args+".add(\"@"+u.getName()+"\");\n"; 
 }

public String visite(Localisation l){
	return args+".add(\"!"+l.getName()+"\");\n"; 
 }
 
 public String visite(Action a){
	return "//Action\n";
 }
 
 public String visite(Noeud n){
	return "//Noeud\n";
 }
 
 public String visite(Print p){
	 String res = "libTw.getTweets("+args+")";
	return "System.out.println("+res+");\n"; 
 }
 
 public String visite(Plot p){
	return "libTw.plot("+args+");\n"; 
 }
 
 public String visite(AVG_Like avg){
	 String res = "libTw.getTweets("+args+")";
	return "libTw.avgLike("+res+");\n"; 
 }
 
 public String visite(Negatif neg){
	 String res = "libTw.getTweets("+args+")";
	return "libTw.negatifTw("+res+");\n"; 
 }
 
 public String visite(Positif pos){
	 String res = "libTw.getTweets("+args+")";
	return "libTw.positifTw("+res+");\n"; 
 }
 
 public String visite(Followers fl){
	 String res = "libTw.getTweets("+args+")";
	return "libTw.nbFollowers("+res+");\n"; 
 }
 
 public String visite(Condition cnd){
	 String res = "if ( libTw.getTweets("+args+")"+cnd.getOperator()+"){\n";
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
		res = "libTw.count("+args+")";
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
