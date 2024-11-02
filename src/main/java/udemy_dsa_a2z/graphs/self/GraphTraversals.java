package udemy_dsa_a2z.graphs.self;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTraversals {
  int vertexCount;
  LinkedList<Integer> adjacencyListArray[];

  public GraphTraversals(int v) {
    this.vertexCount = v;
    adjacencyListArray = new LinkedList[vertexCount];
    for (int i = 0; i < v; i++) {
      adjacencyListArray[i] = new LinkedList<>();
    }
  }

  void addEdge(int source, int destination) {
    adjacencyListArray[source].add(destination);
  }

  public void BFS(int source) {
    boolean[] visited = new boolean[vertexCount];
    LinkedList<Integer> queue = new LinkedList<>();
    visited[source] = true;
    queue.add(source);
    while (queue.size() != 0) {
      source = queue.poll();
      System.out.println(" " + source + " ");
      Iterator<Integer> itr = adjacencyListArray[source].listIterator();
      while (itr.hasNext()) {
        int i = itr.next();
        if (!visited[i])
          visited[i] = true;
        queue.add(i);
      }
    }
  }

  public void DFS(int v) {
    boolean[] visited = new boolean[vertexCount];
    DFSUtil(v, visited);
  }

  private void DFSUtil(int v, boolean[] visited) {
    visited[v] = true;
    System.out.println(" " + v);
    Iterator<Integer> itr = adjacencyListArray[v].listIterator();
    while (itr.hasNext()) {
      int i = itr.next();
      if (!visited[i]) {
        DFSUtil(i, visited);
      }
    }
  }
}
