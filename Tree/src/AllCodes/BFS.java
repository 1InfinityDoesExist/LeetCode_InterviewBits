package AllCodes;

import java.util.LinkedList;
import java.util.Queue;

import MainJava.Node;

public class BFS {
    public void bfs(Node root) {
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	while(!q.isEmpty()) {
	    Node node = q.peek();
	    q.poll();
	    System.out.print(node.data + " ");
	    if(node.left != null){
		q.add(node.left);
	    }
	    if(node.right != null) {
		q.add(node.right);
	    }
	}
    }

}
