package SEP05;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="Gowthami@!@##23334";
		String rgm=name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(rgm.length());

	}

}
