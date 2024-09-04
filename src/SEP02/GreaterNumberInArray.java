package SEP02;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println(max);

	}

}
