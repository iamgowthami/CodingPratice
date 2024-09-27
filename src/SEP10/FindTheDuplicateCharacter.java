package SEP10;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateCharacter {

	public static void main(String[] args) {
		String name="gowthamireddy";
		Set<Character> unique= new HashSet<Character>();
		Set<Character> duplicate= new HashSet<Character>();
		for(char c:name.toCharArray()) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);

	}

}
