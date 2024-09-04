package Sep03;

public class VowelLetterCount {

	public static void main(String[] args) {
		String input = "rajuiUmbrela";
		String vowel="AEIOUaeiou";
		int count=0;
		for(char c:input.toCharArray()) {
			if(vowel.indexOf(c)!=-1) {
				count++;
				System.out.println(c);
				
			}
		}
		System.out.println(count);



	}

}
