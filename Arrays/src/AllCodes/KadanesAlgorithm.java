package AllCodes;

import java.util.ArrayList;

public class KadanesAlgorithm {
    public int maxSubArray(ArrayList<Integer> ai) {
	int max_so_far = Integer.MIN_VALUE;
	int max_ending_here = 0;
	for(int iter = 0; iter < ai.size();iter++) {
	    max_ending_here = max_ending_here + ai.get(iter);
	    if(max_so_far < max_ending_here) {
		max_so_far = max_ending_here;
	    }
	    if(max_ending_here < 0) {
		max_ending_here = 0;
	    }
	}
	return max_so_far;
    }
}
