package javatrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
	static int[] twoSum(int[] A, int target) {
		Set<Integer> set = new LinkedHashSet<>();
		int[] result= new int[2];

		for(int i: A) {
			set.add(i);
		}
		ArrayList<Integer> elements = new ArrayList<>(set);

		for(int i=0 ; i< A.length ;i++) {
			if(set.contains(target-A[i])) {
				result[0] =i ;
				result[1] =elements.indexOf(target-A[i]);
			}
		}
 Arrays.sort(result);
		return result;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{2 ,4, 2, 3, 2},7)));
	}
}

