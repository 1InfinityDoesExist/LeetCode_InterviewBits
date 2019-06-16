package MainClass;

import AllCodes.LoopInLinkedList;
import AllCodes.MiddleElement;

public class MainClassRun {
    public static void main(String[] args) {
	
	LinkedList list = new LinkedList(0);
	list.next = new LinkedList(5);
	list.next.next = new LinkedList(10);
	list.next.next.next = new LinkedList(15);
	list.next.next.next.next = new LinkedList(20);
	list.next.next.next.next.next = new LinkedList(25);
	list.next.next.next.next.next.next = new LinkedList(50);
	
	
	//For loop in linkedList
	
	LinkedList head = new LinkedList(5);
	head.next = new LinkedList(10);
	head.next.next = new LinkedList(15);
	head.next.next.next = new LinkedList(20);
	head.next.next.next.next = head.next.next;
	
	
	LoopInLinkedList loopDetection = new LoopInLinkedList();
	if(loopDetection.detectLoop(head)) {
	    System.out.println("Yes There is a loop in LinkedList");
	}
	else {
	    System.out.println("No There is No Loop in LinkedList");
	}
	
	
	LinkedList listNode = new LinkedList(2);
	listNode.next = new LinkedList(4);
	listNode.next.next = new LinkedList(6);
	listNode.next.next.next = new LinkedList(7);
	listNode.next.next.next.next = new LinkedList(5);
	listNode.next.next.next.next.next = new LinkedList(1);
	
	MiddleElement midElement = new MiddleElement();
	midElement.middleElement(listNode);
    }
}

