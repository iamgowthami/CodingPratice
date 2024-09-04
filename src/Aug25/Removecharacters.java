package Aug25;

public class Removecharacters {

	public static void main(String[] args) {
		String srr="mas2";
		String rm=srr.replaceAll("[^A-Za-z]", "");
		String rm1=srr.replaceAll("[^0-9]", "");

		System.out.println("characters:"+rm.length());
		System.out.println("numbers:"+rm1.length());

		


	}

}
