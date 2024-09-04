package SEP02;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,1,2,3,4};
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		for(int num:arr) {
			if(!unique.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);


	}

}
