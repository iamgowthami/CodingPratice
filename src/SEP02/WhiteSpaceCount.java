package SEP02;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String name="i love  india";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
