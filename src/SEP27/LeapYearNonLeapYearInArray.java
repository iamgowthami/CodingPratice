package SEP27;

public class LeapYearNonLeapYearInArray {

	public static void main(String[] args) {
		int ar[] = { 2022, 2015, 2016, 2014, 2024, 2030, 2028 };
		for(int year:ar) {
			if((year%4==0)&&(year%100!=0)||(year%4==0)) {
				System.out.println("leaf year:"+year);
			}else {
				System.out.println("non leaf year:"+year);
			}
			
		}


	}

}
