package Aug25;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		String name="jajas";
		String rev="";
		char ch;
		String original=name;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("String palindrom"+original);
		}else {
			System.out.println("String not a palindrome:"+rev);
		}
		

	}

}
