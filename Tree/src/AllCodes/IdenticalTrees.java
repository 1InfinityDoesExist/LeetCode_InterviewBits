package AllCodes;

import java.util.LinkedList;
import java.util.Queue;

import MainJava.Node;

public class IdenticalTrees {
    public boolean isIdentical(Node root, Node root1) {
	Queue<Node> q1 = new LinkedList<Node>();
	Queue<Node> q2 = new LinkedList<Node>();
	q1.add(root);
	q2.add(root1);
	while(!q1.isEmpty() || !q2.isEmpty()) {
	    Node node1 = q1.peek();
	    q1.poll();
	    Node node2 = q2.peek();
	    q2.poll();
	    
	    if(node1 == null && node2 == null) {
		return true;
	    }
	    if(node1 == null || node2 == null) {
		return false;
	    }
	    if(node1.data != node2.data) {
		return false;
	    }
	    q1.add(node1.left);
	    q1.add(node1.right);
	    q2.add(node2.left);
	    q2.add(node2.right);
	}
	 return true;
    }
}
