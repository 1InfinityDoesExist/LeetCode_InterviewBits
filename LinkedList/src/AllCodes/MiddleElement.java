package AllCodes;

import MainClass.LinkedList;

public class MiddleElement {
    public void middleElement(LinkedList start) {
	int length = 0;
	LinkedList ptr = start;
	while(ptr.next != null) {
	    length++;
	    ptr = ptr.next;
	}
	for(int iter = 0; iter < length/2+1; iter++) {
	    start = start.next;
	}
	System.out.println(start.data);
    }

}
