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
//		res+= visitor.visite(noeud, arg);
//		noeud = this.getNodChem(noeud, arc.getCouleur());
		while(noeud != null){
			res+= noeud.acceptVisitor(visitor);
			noeud = this.getNodChem(noeud, num); 
		}
		res+="String req_"+arc.getCouleur()+" = LibTw.getTwittes("+arg+");\n";
		return res;
		
	}
}
