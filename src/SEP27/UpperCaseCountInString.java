package SEP27;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String input="GOWthami";
		int count=0;
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(Character.isUpperCase(c)) {
			count++;
			System.out.println(c);
				
			}

		}
		System.out.println(count);

	}

}
