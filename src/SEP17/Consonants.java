package SEP17;

public class Consonants {

	public static void main(String[] args) {
		String input = "i am gowthami my daughter is ushika";
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : input.toCharArray()) {
			if(c==' ') {
				count++;
			}
		}
		System.out.println("\n" + count);
	}
}
