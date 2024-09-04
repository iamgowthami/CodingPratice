package Aug25;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String name="gowthamireddy";
		for(char c:name.toCharArray()) {
			if((name.indexOf(c))!=(name.lastIndexOf(c))) {
				System.out.println(c);
			}
		}

	}

}
