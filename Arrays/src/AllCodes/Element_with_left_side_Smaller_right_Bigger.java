package AllCodes;

import java.util.ArrayList;

public class Element_with_left_side_Smaller_right_Bigger {
    public int middleElement(ArrayList<Integer> ai) {
	int len = ai.size();
	int[] left = new int[len];
	left[0] = ai.get(0);
	for(int iter = 1; iter < len; iter++) {
	    if(left[iter-1] >= ai.get(iter-1)) {
		left[iter] = left[iter-1];
	    }else {
		left[iter] = ai.get(iter-1);
	    }
	}
	
	int[] right = new int[len];
	right[len-1] = ai.get(len-1);
	for(int iter = len-2; iter >=0; iter--) {
	    if(right[iter+1] <= ai.get(iter+1)){
		right[iter] = right[iter+1];
	    }else {
		right[iter] = ai.get(iter+1);
	    }
	}
	for(int iter = 1; iter < len-1; iter++) {
	    if(ai.get(iter) >= left[iter] && ai.get(iter) <= right[iter]) {
		return ai.get(iter);
	    }
	}
	return -1;
    }
}
