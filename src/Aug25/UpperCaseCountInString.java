package Aug25;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String name="GoWthaMI";
		int count=0;
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
