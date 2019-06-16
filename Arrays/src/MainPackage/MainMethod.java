package MainPackage;

import java.util.ArrayList;

import AllCodes.Element_with_left_side_Smaller_right_Bigger;
import AllCodes.KadanesAlgorithm;
import AllCodes.MergeTwoSortedArray;
import AllCodes.MissingNumber;
import AllCodes.Sub_Array_With_Given_Sum;
import AllCodes.TrappingRainWater;

public class MainMethod {
    public static void main(String args[]) {
	
	
	
            System.out.println(010|2);
       
	
	ArrayList<Integer> ai = new ArrayList<>();
	ai.add(15);
	ai.add(2);
	ai.add(4);
	ai.add(8);
	ai.add(9);
	ai.add(5);
	ai.add(10);
	ai.add(23);
	Sub_Array_With_Given_Sum sub = new Sub_Array_With_Given_Sum();
	sub.subArrayWithGivenSum(ai, 23);
	System.out.println();
	KadanesAlgorithm ka = new KadanesAlgorithm();
	System.out.println(ka.maxSubArray(ai));
	
	int[] missingNumber = {1, 2, 3, 4};
	ArrayList<Integer> missingNum = new ArrayList<Integer>();
	for(int iter = 0; iter < missingNumber.length; iter++) {
	    missingNum.add(missingNumber[iter]);
	}
	MissingNumber misNumber = new MissingNumber();
	System.out.println(misNumber.missingNumberInArray(missingNum));
	
	int[] number = {7, 4, 0, 9};
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int iter = 0; iter < number.length; iter++) {
	    al.add(number[iter]);
	}
	Element_with_left_side_Smaller_right_Bigger e = new Element_with_left_side_Smaller_right_Bigger();
	System.out.println(e.middleElement(al));
	
	TrappingRainWater rainWater = new TrappingRainWater();
	System.out.println(rainWater.rainWater(al));
	
	ArrayList<Integer> aa1 = new ArrayList<Integer>();
	aa1.add(1);
	aa1.add(12);
	aa1.add(19);
	aa1.add(112);
	aa1.add(1145);
	
	ArrayList<Integer> aa2 = new ArrayList<Integer>();
	aa2.add(10);
	aa2.add(11);
	aa2.add(12);
	aa2.add(1145);
	aa2.add(11457);
	MergeTwoSortedArray mg = new MergeTwoSortedArray();
	mg.mergeSortedArray(aa1, aa2);
	
	
	
    }
}
