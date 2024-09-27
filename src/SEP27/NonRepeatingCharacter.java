package SEP27;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String input="gowthamireddy";
		for(char c:input.toCharArray()) {
			if(input.indexOf(c)!=(input.lastIndexOf(c))) {
				System.out.println(c);
			}
		}

	}

}
