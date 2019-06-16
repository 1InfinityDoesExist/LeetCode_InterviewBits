package AllCodes;

import MainJava.Node;

public class LowestCommonAncestor {
    
    public Node LCA(Node root, int x, int y) {
	if(root == null) {
	    return root;
	}
	if(root.data == x || root.data== y) {
	    return root;
	}
	Node lt = LCA(root.left, x, y);
	Node rt = LCA(root.right, x, y);
	
	if(lt != null && rt != null) {
	    return root;
	}
	return lt != null ? lt : rt;
    }
    public boolean found(Node root, int k) {
	if(root == null) {
	    return false;
	}
	if(root.data == k) {
	    return true;
	}
	return (found(root.left, k) ||  found(root.right, k));
    }
    public void lcaNew(Node root, int x, int y) {
	if(!found(root, x) || !found(root, y)) {
	    return ;
	}
	
	Node node = LCA(root, x, y);
	if(node == null) {
	    System.out.println("Nothing Found");
	}
	System.out.println(node.data);
	
    }

}
