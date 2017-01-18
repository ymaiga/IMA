package validators;

import esir3.ima.twitter.visitors.Utils;
import imaModel2.*;

public class ValidatorUtils {
	
	public boolean notDetectCycle(Prog p) throws IMATweetException{
		for(Noeud noeud : p.getNoeuds()){
			for(Arc arc : noeud.getArcSortants()){
				int num = arc.getCouleur();
				Utils utl = new Utils();
				Noeud n_suiv = utl.getNodChem(noeud, num);
				while(n_suiv != null){
					if(n_suiv == noeud) throw new IMATweetException("Detection de cycle dans le programme");
					n_suiv = utl.getNodChem(n_suiv, num);
				}
			}
		}
		return true;
		
	}

}
