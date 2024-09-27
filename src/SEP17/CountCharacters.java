package SEP17;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		String input = "i am gowthami my daughter is ushika";
		Map<Character, Integer> wordcount= new HashMap<Character, Integer>();
		for(char c:input.toCharArray()) {
			if(c!=' ') {
				wordcount.put(c, wordcount.getOrDefault(c, 0)+1);
			}
			
			}
		System.out.println(wordcount);
		}


	}


