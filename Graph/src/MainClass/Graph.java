package MainClass;

import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer>[] adj;
    Graph(int V){
	this.V = V;
	adj = new LinkedList[V];
	
	for(int iter = 0; iter < V; iter++) {
	    adj[iter] = new LinkedList<Integer>();
	}
    }
    
    void addEdges(Graph graph, int u, int v) {
	graph.adj[u].add(v);
	graph.adj[v].add(u);
    }
}
