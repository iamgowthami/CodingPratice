package SEP27;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String input="gowthami reddy karthik";
		int count=0;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
