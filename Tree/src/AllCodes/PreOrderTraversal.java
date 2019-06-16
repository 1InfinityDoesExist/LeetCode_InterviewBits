package AllCodes;

import java.util.Stack;

import MainJava.Node;

public class PreOrderTraversal {
    public void preOrder(Node root) {
	Stack<Node> s = new Stack<Node>();
	s.push(root);
	while(!s.empty()) {
	    Node node = s.peek();
	    s.pop();
	    System.out.print(node.data + " ");
	    if(node.right != null) {
		s.push(node.right);
	    }
	    if(node.left != null) {
		s.push(node.left);
	    }
	}
    }
}
