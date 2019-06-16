package AllCodes;

import java.util.Stack;

import MainJava.Node;

public class PostOrderTraversal {
    public void postOrder(Node root) {
	Stack<Node> s = new Stack<Node>();
	Stack<Node> output = new Stack<Node>();
	s.push(root);
	while(!s.empty()) {
	    Node node = s.peek();
	    s.pop();
	    output.push(node);
	    if(node.left != null) {
		s.push(node.left);
	    }
	    if(node.right != null) {
		s.push(node.right);
	    }
	}
	while(!output.empty()) {
	    System.out.print(output.peek().data + " ");
	    output.pop();
	}
    }
}
