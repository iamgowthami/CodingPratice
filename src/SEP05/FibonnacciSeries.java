package SEP05;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,sum;
		int num=18;
		for(int i=1;i<=num;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
		
		
		
		

	}

}
