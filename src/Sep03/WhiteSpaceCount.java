package Sep03;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String input = "India is  a big country";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);



	}

}
