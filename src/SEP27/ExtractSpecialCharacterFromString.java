package SEP27;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String input="GOwth1@@R#$%#%#^#^1223";
		String remove=input.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(remove);

	}

}
