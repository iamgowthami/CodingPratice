package SEP16;

import java.util.HashMap;
import java.util.Map;

public class GFG {

	public static void main(String[] args) {
		String sentence = "Interview with Aditi with CGO Interview";
		String[] words=sentence.split(" ");
		Map<String, Integer> map=new HashMap<>();
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
				
			}
		for(String word:map.keySet()) {
			System.out.println(word+" "+map.get(word));
			
		}



	}

}
