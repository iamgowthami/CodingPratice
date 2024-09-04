package SEP02;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String input="gowthamigow";
		Set<Character>unique=new HashSet<Character>();
		Set<Character>duplicate=new HashSet<Character>();
		for(char c:input.toCharArray()) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
			
		}
		System.out.println(duplicate);


	}

}
