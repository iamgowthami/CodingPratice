package SEP02;

public class VowelLetterCount {

	public static void main(String[] args) {
		String name="gowthami";
		String vowel="AEIOUaeiou";
		int count=0;
		for(char c:name.toCharArray()) {
			if(vowel.indexOf(c)!=-1) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);

	}

}
