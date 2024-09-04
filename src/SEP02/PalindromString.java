package SEP02;

public class PalindromString {

	public static void main(String[] args) {
		String input="sas";
		String rev="";
		String original=input;
		char ch;
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			rev=ch+rev;
			
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("palindrome String:"+original);
		}else {
			System.out.println("not palindrome String:"+rev);

		}
			

	}

}
