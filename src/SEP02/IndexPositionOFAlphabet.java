package SEP02;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String name="gowthami";
		char index='m';
		int indexposition = name.indexOf(index);
		for(int i=0;i<name.length()-1;i++) {
			if(name.charAt(i)==index) {
				System.out.println(i);
			}
		}

	}

}
