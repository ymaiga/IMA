package esir3.im.libs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Dictionnaire {


	private static final String PATH_DICO_POS = "E:\\test\\filename.txt";
	private static final String PATH_DICO_NEG = "E:\\test\\filename.txt";
	private static final String PATH_STOPWORD = "E:\\test\\filename.txt";

	
	private HashSet<String> dico_pos = new HashSet<String>(); 
	private HashSet<String> dico_neg = new HashSet<String>(); 
	private HashSet<String> stopWords = new HashSet<String>();
	
	public Dictionnaire() {

		String sCurrentLine;

		BufferedReader brPos = null;
		BufferedReader brNeg = null;
		BufferedReader brFiltre = null;


		try {
			// creation dico positif
			brPos = new BufferedReader(new FileReader(PATH_DICO_POS));
			while ((sCurrentLine = brPos.readLine()) != null) {
				dico_pos.add(sCurrentLine.trim().toLowerCase());
			}
			
			// creation dico negatif
			brNeg = new BufferedReader(new FileReader(PATH_DICO_NEG));
			while ((sCurrentLine = brNeg.readLine()) != null) {
				dico_neg.add(sCurrentLine.trim().toLowerCase());
			}
			
			// creation stopWords
			brFiltre = new BufferedReader(new FileReader(PATH_STOPWORD));
			while ((sCurrentLine = brFiltre.readLine()) != null) {
				stopWords.add(sCurrentLine.trim().toLowerCase());
			}
			
			if (brPos != null){
				brPos.close();
			}
			if(brNeg != null){
				brNeg.close();
			}
			if(brFiltre != null){
				brFiltre.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public ArrayList<String> filter(ArrayList<String> wordsList){
//		ArrayList<String> filtered = new ArrayList<String>();
//		
//		for(String word : wordsList){
//			if(!this.stopWords.contains(word.trim().toLowerCase()){
//				filtered.add(word);
//			}
//		}
//		return filtered;
//	}

}
