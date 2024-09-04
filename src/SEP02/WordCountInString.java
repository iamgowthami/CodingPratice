package SEP02;

public class WordCountInString {

	public static void main(String[] args) {
		String name="gowthami reddy suresh";
		int count=1;
		for(int i=1;i<name.length()-1;i++) {
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' ')){
				count++;
			
			}
		}
		System.out.println(count);

	}

}
