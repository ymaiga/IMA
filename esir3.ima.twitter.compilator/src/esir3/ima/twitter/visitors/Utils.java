package esir3.ima.twitter.visitors;

import imaModel2.*;

public class Utils {

	public  Noeud getNodChem(Noeud n, int num){
		for(Arc arc : n.getArcSortants()){
			if(arc.getCouleur() == num) return arc.getNext();
		}
		return null;
	}
	
	public  String iterateonChem(Noeud noeud,Arc arc,String arg){
		String res ="//debut parcours du chemin"+arc.getCouleur()+" (id = "+arc.getId()+")\n";
		VisitorJava visitor = new VisitorJava(arg);
		int num = arc.getCouleur();
		Noeud n_prec = noeud;
		while(noeud != null){
			Noeud n_suiv = this.getNodChem(noeud, num); 
			if(noeud instanceof Condition){
				res+=visitor.visite((Condition)noeud,n_prec);
			}
			else {
				res+= noeud.acceptVisitor(visitor);
			}
			 n_prec = noeud;
			noeud = n_suiv;
		}
		res+="List<String> req_"+arc.getCouleur()+" = libTw.getTweets("+arg+");\n";
		return res;
		
	}
}
