package AllCodes;

import MainClass.LinkedList;

public class Traversal {
    public void traverse(LinkedList start) {
	LinkedList ptr = start;
	while(ptr != null) {
	    System.out.print(ptr.data + " ");
	    ptr = ptr.next;
	}
    }

}
