package SEP27;

import java.util.HashMap;

public class Wordcontoccurance {

	public static void main(String[] args) {
		String sentence = "Interview with with, Aditi CGO Interview";
		String[] words=sentence.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:words) {
			word = word.replaceAll("[^a-zA-Z]", "");
			map.put(word, map.getOrDefault(word, 0)+1);
			
		}
		
		for(String word:map.keySet()) {
			System.out.println(word+":"+map.get(word));
		}


	}

}
