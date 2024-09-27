package SEP10;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="gowt123@!@#####";
		String rgm=name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(rgm);

	}

}
