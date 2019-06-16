package AllCodes;

import java.util.ArrayList;

public class MergeTwoSortedArray {
    public void mergeSortedArray(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	int len1 = a1.size();
	int len2 = a2.size();
	int[] dp = new int[len1+len2];
	int iter = 0, jter = 0, kter= 0;
	while(iter < len1 && jter < len2) {
	    if(a1.get(iter) < a2.get(jter)) {
		dp[kter] = a1.get(iter);
		iter++;
		kter++;
	    }else {
		dp[kter] = a2.get(jter);
		jter++;
		kter++;
	    }
	}
	while(iter < len1) {
	    dp[kter] = a1.get(iter);
	    iter++;
	    kter++;
	}
	while(jter < len2)
	{
	    dp[kter] = a2.get(jter);
	    jter++;
	    kter++;
	}
	for(int pter = 0; pter < dp.length; pter++) {
	    System.out.print(dp[pter] + " ");
	}
    }
    
    
}
