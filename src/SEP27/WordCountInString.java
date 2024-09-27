package SEP27;

public class WordCountInString {

	public static void main(String[] args) {
		String input = "masum raza i love   you";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if((input.charAt(i)==' ')&&(input.charAt(i+1)!=1)){
				count++;
			}
			
		}
		System.out.println(count);


	}

}
