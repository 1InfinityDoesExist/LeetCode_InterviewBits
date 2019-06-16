package AllCodes;

import java.util.Stack;
import MainJava.Node;

public class InorderTraversal {
    public void inOrder(Node root) {
	if(root == null) {
	    return;
	}
	Stack<Node> s = new Stack<Node>();
	Node ptr = new Node();
	ptr = root;
	while(!s.empty() || ptr != null) {
	    if(ptr != null) {
		s.push(ptr);
		ptr = ptr.left;
	    }
	    else {
		Node node = s.peek();
		s.pop();
		System.out.print(node.data + " ");
		ptr = node.right;
	    }
	}
    }
}
