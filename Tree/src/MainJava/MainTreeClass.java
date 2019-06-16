package MainJava;

import AllCodes.BFS;
import AllCodes.DFS;
import AllCodes.HeightOfTree;
import AllCodes.IdenticalTrees;
import AllCodes.InorderTraversal;
import AllCodes.LevelOrderTraversal;
import AllCodes.LowestCommonAncestor;
import AllCodes.PostOrderTraversal;
import AllCodes.PreOrderTraversal;

public class MainTreeClass {
    public static void main(String[] args) {
	Node root = new Node(1);
	root.left = new Node(10);
	root.left.left = new Node(5);
	root.right = new Node(39);
	
	InorderTraversal inOrderTraversal = new InorderTraversal();
	inOrderTraversal.inOrder(root);
	System.out.println();
	PreOrderTraversal preOrder = new PreOrderTraversal();
	preOrder.preOrder(root);
	System.out.println();
	PostOrderTraversal postOrder = new PostOrderTraversal();
	postOrder.postOrder(root);
	System.out.println();
	LevelOrderTraversal levelOrder = new LevelOrderTraversal();
	levelOrder.levelOrderTraversal(root);
	System.out.println();
	DFS depthFirstSearch = new DFS();
	depthFirstSearch.dfs(root);
	System.out.println();
	BFS bredthFirstSearch = new BFS();
	bredthFirstSearch.bfs(root);
	
	System.out.println();
	HeightOfTree height = new HeightOfTree();
	System.out.println("Height Of Tree is:- " + height.heightOfTree(root));
	
	
	
	//For Identical Trees...!!!
	Node root1 = new Node(1);
	root1.left = new Node(10);
	root1.left.left = new Node(5);
	root1.right = new Node(30);
	IdenticalTrees idTrees = new IdenticalTrees();
	if(idTrees.isIdentical(root, root1)) {
	    System.out.println("Yes They are Identical");
	}
	else {
	    System.out.println("No They Are Not Identical");
	}
	
	
	Node rroot = new Node(1);
	rroot.left = new Node(2);
	rroot.right = new Node(3);
	rroot.left.left = new Node(7);
	rroot.left.right = new Node(6);
	rroot.right.left = new Node(5);
	rroot.right.right = new Node(4);
	
	Node roott = new Node(20); 
	roott.left = new Node(8); 
	roott.right = new Node(22); 
	roott.left.left = new Node(4); 
	roott.left.right = new Node(12); 
	roott.left.right.left = new Node(10); 
	roott.left.right.right = new Node(14); 
	
	LowestCommonAncestor lca = new LowestCommonAncestor();
	lca.lcaNew(roott, 10, 14);
    }
}
