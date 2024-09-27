package SEP27;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String input="gowthami";
		char position='o';
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==position) {
				System.out.println(i);
			}
		}

	}

}
