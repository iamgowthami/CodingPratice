package SEP15;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String name="Tata,Swift,Audi,Mercedes,Tata,Renault";
		String[] words=name.split(",");
		Set<String> uniqueword=new HashSet<String>();
		for(String word:words) {
			uniqueword.add(word.trim());
		}
		for(String word:uniqueword) {
			System.out.println(word);
		}



	}

}
