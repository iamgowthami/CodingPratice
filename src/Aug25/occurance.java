package Aug25;

import java.util.HashMap;
import java.util.Map;

public class occurance {

	public static void main(String[] args) {
		         String input="masum stay in india and bangalore";
				 Map<Character,Integer> map = new HashMap<>();
				 int count=0;
				 for(char c:input.toCharArray()){
				 map.put(c,map.getOrDefault(c,0)+1);
				 count++;
				 System.out.println(c);
				 }
				 System.out.println(count);
	}

}
