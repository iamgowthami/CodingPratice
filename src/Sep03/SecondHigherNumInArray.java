package Sep03;

public class SecondHigherNumInArray {

	public static void main(String[] args) {
	int arr[] = { 112, 34, 553, 35, 23, 678, 876, 366, 53, 757, 3425, 4444 };
	 int first=Integer.MIN_VALUE;
	 int second=Integer.MIN_VALUE;
	 for(int num:arr) {
		 if(num>first) {
			 second=first;
			 first=num;
		 }else if(num>second&&num!=first) {
			 num=second;
		 }
	 }
	 System.out.println(second);
	}

}
