package esir3.im.libs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashSet;

public class Dictionnaire {

	private static final String PATH_DICO_POS = "dicos/dicoPositif.txt";
	private static final String PATH_DICO_NEG = "dicos/dicoNegatif.txt";
	private static final String PATH_STOPWORD = "dicos/stopWord.txt";

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

			if (brPos != null) {
				brPos.close();
			}
			if (brNeg != null) {
				brNeg.close();
			}
			if (brFiltre != null) {
				brFiltre.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> filter(ArrayList<String> wordsList) {
		ArrayList<String> filtered = new ArrayList<String>();

		for (String word : wordsList) {
			if (!this.stopWords.contains(normalize(word.trim().toLowerCase()))) {
				filtered.add(word);
			}
		}
		return filtered;
	}

	public int getScore(ArrayList<String> words) {
		int pointPositif = 0;
		int pointNegatif = 0;

		for (String word : words) {
			if (dico_pos.contains(word.trim().toLowerCase())) {
				pointPositif++;
			} else if (dico_neg.contains(word.trim().toLowerCase())) {
				pointNegatif++;
			}
		}
		return pointPositif - pointNegatif;
	}

	private String normalize(String input) {
		return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
}
