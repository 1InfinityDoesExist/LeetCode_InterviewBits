package AllCodes;

import MainClass.LinkedList;

public class ReverseLinkedList {
    public LinkedList reverseLinkedList(LinkedList head) {
	LinkedList prev = null;
	LinkedList current = head;
	LinkedList next;
	while(current != null) {
	    next = current.next;
	    current.next = prev;
	    prev = current;
	    current = next;
	}
	head = prev;
	return head;
    }
}
