package Sep03;

public class WordCountInString {

	public static void main(String[] args) {
		String input = "suresh i love you ushika";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if((input.charAt(i)==' ')&&(input.charAt(i+1)!=' ')){
				count++;
				
			}
		}
		System.out.println(count);



	}

}
