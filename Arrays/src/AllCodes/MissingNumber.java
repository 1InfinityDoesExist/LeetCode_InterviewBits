package AllCodes;

import java.util.ArrayList;

public class MissingNumber {
    public int missingNumberInArray(ArrayList<Integer> ai) {
	int len = ai.size()+1;
	int total = len * (len +1)/2;
	
	int sum = 0;
	for(int iter = 0; iter < ai.size(); iter++) {
	    sum = sum + ai.get(iter);
	}
	return total-sum;
    }

}
