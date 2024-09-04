package Aug25;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String name="tata,nexon,swift,tata";
		String[] word=name.split(",");
		Set<String> unquieword=new HashSet<String>();
		for(String words:word) {
			unquieword.add(words.trim());
		}
		for(String words:unquieword) {
			System.out.println(words);
		}

	}

}
