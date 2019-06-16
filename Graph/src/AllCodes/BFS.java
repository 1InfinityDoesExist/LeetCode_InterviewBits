package AllCodes;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void bfsWalk(int start,int V , LinkedList<Integer>[] adj) {
	boolean[] visited = new boolean[V];
	for(int iter = 0; iter < V; iter++) {
	    visited[iter] = false;
	}
	Queue<Integer> q = new LinkedList<Integer>();
	q.add(start);
	visited[start] =true;
	while(!q.isEmpty()) {
	    int v = q.peek();
	    q.poll();
	    System.out.print(v + " ");
	    for(int iter = 0; iter < adj[v].size(); iter++) {
		if(!visited[adj[v].get(iter)]) {
		    visited[adj[v].get(iter)] = true;
		    q.add((adj[v].get(iter)));
		}
	    }
	}
    }
}
