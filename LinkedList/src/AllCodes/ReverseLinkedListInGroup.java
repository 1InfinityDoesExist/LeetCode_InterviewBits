package AllCodes;

import MainClass.LinkedList;

public class ReverseLinkedListInGroup {
    public LinkedList reversalInGroup(LinkedList head, final int k) {
	LinkedList prev = null;
	LinkedList current = head;
	LinkedList next = null;
	int count = 0;
	while(count < k && current != null) {
	    count++;
	    next = current.next;
	    current.next = prev;
	    prev = current;
	    current = next;
	}
	if(next != null) {
	    head.next = reversalInGroup(next, k);
	}
	
	return prev;
    }

}
