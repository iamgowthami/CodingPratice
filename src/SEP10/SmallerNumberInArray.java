package SEP10;

public class SmallerNumberInArray {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 4, 6, 8, 2, 33, 3345, 55 };
		int min=Integer.MAX_VALUE;
		for(int num:ar) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);
		

	}

}
