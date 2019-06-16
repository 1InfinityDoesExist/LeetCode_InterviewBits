package AllCodes;

import java.util.ArrayList;
import java.util.Stack;

import MainJava.Node;

public class SpiralForm {
    public void printSpiralForm(Node root) {
	if(root == null) {
	    return;
	}
	Stack<Node> s1 = new Stack<Node>();
	Stack<Node> s2 = new Stack<Node>();
	s1.push(root);
	while(!s1.isEmpty() || !s2.isEmpty()) {
	    ArrayList<Integer> ai = new ArrayList<Integer>();
	    int count1 = 0;
	    while(!s1.empty()) {
		count1++;
		Node node1 = s1.peek();
		s1.pop();
		ai.add(node1.data);
		if(node1.right != null) {
		    s2.add(node1.right);
		}
		if(node1.left != null) {
		    s2.add(node1.left);
		}
	    }
	    if(count1 != 0) {
		for(int iter = 0; iter < ai.size(); iter++) {
		    System.out.print(ai.get(iter) + " ");
		}
	    }
	    System.out.println();
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    int count2 = 0;
	    while(!s2.empty()) {
		count2++;
		Node node2 = s2.peek();
		s2.pop();
		al.add(node2.data);
		if(node2.left != null) {
		    s1.push(node2.left);
		}
		if(node2.right != null) {
		    s1.push(node2.right);
		}
	    }
	    if(count2 != 0) {
		for(int iter = 0; iter < al.size(); iter++) {
		    System.out.print(al.get(iter ) + " ");
		}
	    }
	    System.out.println();
	}
    }
}
