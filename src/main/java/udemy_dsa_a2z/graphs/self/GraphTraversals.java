package udemy_dsa_a2z.graphs.self;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTraversals {
  int vertexCount;
  LinkedList<Integer> adjacencyListArray[];

  public GraphTraversals(int v) {
    this.vertexCount = v;
    adjacencyListArray = new LinkedList[v];
    for (int i = 0; i < v; ++i) {
      adjacencyListArray[i] = new LinkedList<>();
    }
  }

  void addEdge(int source, int destination) {
    adjacencyListArray[source].add(destination);
  }

  public void BFS(int source) {
    boolean visited[] = new boolean[vertexCount];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[source] = true;
    queue.add(source);
    while (queue.size() != 0) {
      source = queue.poll();
      System.out.print(" " + source + " ");
      Iterator<Integer> itr = adjacencyListArray[source].listIterator();
      while (itr.hasNext()) {
        int i = itr.next();
        if (!visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }

  public void DFS(int v) {
    boolean[] visited = new boolean[vertexCount];
    DFSUtil(v, visited);
  }

  private void DFSUtil(int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(" " + v);
    Iterator<Integer> itr = adjacencyListArray[v].listIterator();
    while (itr.hasNext()) {
      int i = itr.next();
      if (!visited[i]) {
        DFSUtil(i, visited);
      }
    }
  }

  public static void main(String[] args) {
    GraphTraversals graph = new GraphTraversals(4);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    System.out.println("Breadth First Traversal ");
    graph.BFS(0);
    System.out.println();
    System.out.println("Depth First Traversal ");
    graph.DFS(0);
  }
}
