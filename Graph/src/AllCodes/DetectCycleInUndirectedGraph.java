package AllCodes;

import java.util.LinkedList;

public class DetectCycleInUndirectedGraph {
    
    public boolean isCyclic(int v, boolean[] visited, int parent, LinkedList<Integer>[] adj) {
	if(!visited[v]) {
	    visited[v] = true;
	}
	for(int iter = 0; iter < adj[v].size(); iter++) {
	    if(!visited[adj[v].get(iter)]) {
		visited[adj[v].get(iter)] = true;
		if(isCyclic(adj[v].get(iter), visited, v, adj)) {
		    return true;
		}
	    }else {
		if(adj[v].get(iter) != parent) {
		    return true;
		}
	    }
	}
	return false;
    }
    
    public boolean cycleDetection(int V, LinkedList<Integer>[] adj) {
	boolean[] visited = new boolean[V];
	for(int iter = 0; iter < V; iter++) {
	    visited[iter] = false;
	}
	for(int iter = 0; iter < V; iter++) {
	    if(isCyclic(iter, visited, -1, adj)) {
		return true;
	    }
	}
	return false;
    }
}
