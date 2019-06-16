package AllCodes;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    public void dfsWalk(int start, int V, LinkedList<Integer>[] adj) {
	boolean[] visited = new boolean[V];
	for(int iter = 0; iter < V; iter++) {
	    visited[iter] = false;
	}
	Stack<Integer> s = new Stack<Integer>();
	s.push(start);
	visited[start] =true;
	while(!s.empty()) {
	    int x = s.peek();
	    s.pop();
	    System.out.print(x + " ");
	    for(int iter = 0; iter < adj[x].size(); iter++)
	    {
		if(!visited[adj[x].get(iter)]) {
		    visited[adj[x].get(iter)] =true;
		    s.push(adj[x].get(iter));
		}
	    }
	}
	
    }
}
