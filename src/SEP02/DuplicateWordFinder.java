package SEP02;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String input = "Tata,Swift,Audi,Mercedes,Tata,Renault";

		String[] word=input.split(",");
		Set<String> uniqueword=new HashSet<String>();
		for(String words:word) {
			uniqueword.add(words.trim());
		}
		for(String words:uniqueword) {
			System.out.println(words);
		}

	}

}
