package AllCodes;

import MainClass.LinkedList;

public class DeleteNodeWithOutHeadPointer {
    public void deleteNode(LinkedList node) {
	LinkedList ptr = node.next;
	node.data = ptr.data;
	node.next = ptr.next;
    }
    
    
    
}
