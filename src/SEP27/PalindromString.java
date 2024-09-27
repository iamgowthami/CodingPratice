package SEP27;

public class PalindromString {

	public static void main(String[] args) {
		String input="jaj";
		String  rev="";
		String original=input;
		char ch;
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			rev=ch+rev;

		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("palindrome:"+original);
		}else {
			System.out.println("not a palindrome:"+rev);
		}
	}

}
