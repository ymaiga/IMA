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
		String res ="//debut itération"+noeud+"\n";
		VisitorJava visitor = new VisitorJava();
//		res+= visitor.visite(noeud, arg);
//		noeud = this.getNodChem(noeud, arc.getCouleur());
		while(noeud != null){
			res+= visitor.visite(noeud, arg);
			noeud = this.getNodChem(noeud, arc.getCouleur()); 
		}
		return res;
		
	}
}
