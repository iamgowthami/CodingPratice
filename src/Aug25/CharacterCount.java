package Aug25;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String name="gowthami";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:name.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0) +1);
					
			}
		System.out.println(map);
		}

	}


