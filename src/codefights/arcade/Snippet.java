package codefights.arcade;

import java.util.Arrays;

public class Snippet {
	
	static boolean areSimilar(int[] a, int[] b) {
	int countofDifference =0;	
		for (int  i=0; i<a.length; i++) {
			if((a[i]-b[i])!=0) 
				countofDifference++;			
		}			
			Arrays.sort(a);
			Arrays.sort(b);		
			return ((countofDifference<=2)&& (Arrays.equals(a, b))) ;
	}
	
	
	public static void main (String [] args) {
		
		int [] a = {1,2,4};
		int [] b = {2,1,4};
		
		System.out.println(areSimilar( a ,b ));
		}
	}

	
	
	


