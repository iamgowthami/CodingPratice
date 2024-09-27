package SEP27;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String input ="tata,nexon,punch,tata";
		String[] word=input.split(",");
		Set<String> unique= new HashSet<String>();
		for(String words:word) {
			unique.add(words.trim());
		}
		for(String words:unique) {
			System.out.println(words);
		}
	}

}
