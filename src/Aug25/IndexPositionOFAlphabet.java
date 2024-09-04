package Aug25;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String name="gowthami";
		char index='o';
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==index) {
				System.out.println(i);
			}
		}

	}

}
