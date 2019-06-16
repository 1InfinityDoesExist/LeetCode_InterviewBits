package AllCodes;

import java.util.LinkedList;
import java.util.Queue;

import MainJava.Node;

public class HeightOfTree {
    public int heightOfTree(Node root) {
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	int height = 0;
	while(true) {
	    int sz = q.size();
	    if(sz == 0) {
		return height;
	    }
	    height++;
	    while(sz-- > 0) {
		Node node = q.peek();
		q.poll();
		if(node.left != null) {
		    q.add(node.left);
		}
		if(node.right != null)
		{
		    q.add(node.right);
		}
	    }
	}
    }
}
