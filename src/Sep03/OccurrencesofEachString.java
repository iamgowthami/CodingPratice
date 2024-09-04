package Sep03;

import java.util.HashMap;

public class OccurrencesofEachString {

	public static void main (String[] args) {

		String sentence = "Interview with Aditi CGO Interview";

		String[] words = sentence.toLowerCase().split(" ");

		HashMap<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {

		wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

		}

		for (String word : wordCount.keySet()) {

		System.out.println(word + ": " + wordCount.get(word));

		}

		}

}
