package AllCodes;

import java.util.Stack;

import MainJava.Node;

public class DFS {
    public void dfs(Node root) {
	Stack<Node> s = new Stack<Node>();
	s.push(root);
	while(!s.empty()) {
	    Node node = s.peek();
	    s.pop();
	    System.out.print(node.data + " ");
	    if(node.left != null) {
		s.push(node.left);
	    }
	    if(node.right != null) {
		s.push(node.right);
	    }
	}
    }

}
