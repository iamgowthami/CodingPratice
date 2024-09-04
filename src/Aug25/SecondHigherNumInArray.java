package Aug25;

public class SecondHigherNumInArray {

	public static void main(String[] args) {
		int arr[]= {1,23,4,56,7,78,89};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second &&num!=first) {
				num=second;
			}
		
		}
		System.out.println(second);

	}

}
