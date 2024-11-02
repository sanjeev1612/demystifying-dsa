package udemy_dsa_a2z.graphs.self;

import java.util.LinkedList;

public class Graph {
  int vertexCount;
  LinkedList<Integer> adjacencyList[];

  public Graph(int V) {
    this.vertexCount = V;
    adjacencyList = new LinkedList[vertexCount];
    for (int i = 0; i < vertexCount; i++) {
      this.adjacencyList[i] = new LinkedList<>();
    }
  }

  void addEdge(int source, int destination) {
    adjacencyList[source].add(destination);
    adjacencyList[destination].add(source);
  }

  private void printGraph() {
    for (int v = 0; v < this.vertexCount; v++) {
      System.out.print("Adjacency list of vertex " + v + " is ");
      for (Integer i : adjacencyList[v]) {
        System.out.print(" -> " + i);
      }
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addEdge(0, 1);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);
    graph.printGraph();
  }
}
