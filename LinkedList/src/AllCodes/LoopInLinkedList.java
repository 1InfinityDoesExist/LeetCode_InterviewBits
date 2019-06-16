package AllCodes;

import MainClass.LinkedList;

public class LoopInLinkedList {
    public boolean detectLoop(LinkedList head) {
	LinkedList slow = head;
	LinkedList fast = head;
	while(fast.next != null && fast.next.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	    if(slow == fast) {
		return true;
	    }
	}
	return false;
    }
}
