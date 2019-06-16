package AllCodes;

import java.util.LinkedList;

public class DetectCycleInDirectedGraph {
    
    public boolean isCyclic(int v, boolean[] visited, boolean[] restack, LinkedList<Integer>[] adj){
	if(!visited[v]) {
	    visited[v] =true;
	    restack[v] =true;
	    for(int iter = 0; iter < adj[iter].size(); iter++) {
		if(!visited[adj[v].get(iter)]) {
		    visited[adj[v].get(iter)] = true;
		    if(isCyclic(adj[v].get(iter), visited, restack, adj)) {
			return true;
		    }
		}else if(restack[adj[v].get(iter)]) {
		    return true;
		}
	    }
	}
	restack[v] = false;
	return false;
    }
    
    public boolean detectCycle(int V, LinkedList<Integer>[] adj) {
	boolean[] visited = new boolean[V];
	for(int iter = 0; iter < V; iter++) {
	    visited[iter] = false;
	}
	boolean[] restack = new boolean[V];
	for(int iter = 0; iter < V; iter++) {
	    restack[iter] = false;
	}
	for(int iter = 0; iter < V; iter++) {
	    if(isCyclic(iter, visited, restack, adj)) {
		return true;
	    }
	}
	return false;
    }

}
