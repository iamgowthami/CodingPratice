package SEP02;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="ggowtha!@@#$$%%%18838351968";
		String remove=name.replaceAll("[^A-Za-z]", "");
		System.out.println(remove);

	}

}
