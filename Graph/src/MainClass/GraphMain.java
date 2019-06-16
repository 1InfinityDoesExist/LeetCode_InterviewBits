package MainClass;

import AllCodes.BFS;
import AllCodes.DFS;
import AllCodes.DetectCycleInDirectedGraph;
import AllCodes.DetectCycleInUndirectedGraph;

public class GraphMain {
    public static void main(String[] args) {
	int V = 4;
	Graph graph = new Graph(V);
	graph.addEdges(graph, 0, 1);
	graph.addEdges(graph, 0, 2);
	graph.addEdges(graph, 1, 2);
	graph.addEdges(graph, 2, 0);
	graph.addEdges(graph, 2, 3);
	graph.addEdges(graph, 3, 3);
	
	BFS bfs = new BFS();
	bfs.bfsWalk(0, V, graph.adj);
	
	System.out.println();
	DFS dfs = new DFS();
	dfs.dfsWalk(0, V, graph.adj);
	System.out.println();
	System.out.println("This is to detect graph in undirectedGraph");
	DetectCycleInUndirectedGraph dc = new DetectCycleInUndirectedGraph();
	if(dc.cycleDetection(V, graph.adj)) {
	    System.out.println("Yes there is a cycle");
	}else {
	    System.out.println("No there is no cycle");
	}
	
	DetectCycleInDirectedGraph dgraph = new DetectCycleInDirectedGraph();
	if(dgraph.detectCycle(V, graph.adj)) {
	    System.out.println("Yes there is a cycle");
	}else {
	    System.out.println("No there is no cycle");
	}
    }
}
