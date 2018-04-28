package codefights.arcade;

import java.util.Arrays;

public class MakeArrayConsecutive {
public static int makeArrayConsecutive2(int[] statues) {

		
		
		int difference = 0;
		Arrays.sort(statues);
		for (int i = 0; i < statues.length - 1; i++) {
				difference += statues[i + 1] - statues[i] - 1;	
		}
		return difference;
	}


	
	public static void main(String[] args) {

		int[] statue = { 6,0,8 };

		System.out.println(makeArrayConsecutive2(statue));
	}
}
