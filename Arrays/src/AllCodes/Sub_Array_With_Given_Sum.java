package AllCodes;

import java.util.ArrayList;

public class Sub_Array_With_Given_Sum {
    public void subArrayWithGivenSum(ArrayList<Integer> ai, final int sum) {
	int currentSum = ai.get(0);
	int start = 0;
	for(int iter = 1; iter < ai.size(); iter++) {
	    
	    while(currentSum > sum && start < iter-1) {
		currentSum = currentSum - ai.get(start);
		start++;
	    }
	    if(currentSum == sum ) {
		for(int jter = start; jter <= iter-1; jter++) {
		    System.out.print(ai.get(jter) + " ");
		}
		return;
	    }
	    if(iter < ai.size()) {
		currentSum = currentSum + ai.get(iter);
	    }
	}
    }

}
