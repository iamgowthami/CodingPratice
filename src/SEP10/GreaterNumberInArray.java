package SEP10;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 4, 6, 8, 2, 33, 3345, 55 };
		int max=Integer.MIN_VALUE;
		for(int num:ar) {
			if(max<num) {
				max=num;
				
			}
		}
		System.out.println(max);



	}

}
