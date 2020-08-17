package example.graph;

import java.util.ArrayList;
import java.util.List;

public class Ex_adjacencyList {
  public static void main(String[] args) {
    AdjList adjList = new AdjList(6);
    adjList.setUndirectedEdge(5,2); // (5,2),(2,5) 추가
    adjList.setUndirectedEdge(1,4); // (1,4),(4,1) 추가
    adjList.setDirectedEdge(2, 3); // (2,3) 추
    System.out.println(adjList.getGraph().toString());
  }
}

class AdjList {
  private List<List<Integer>> list;

  public AdjList(int initSize) {
    this.list = new ArrayList<>();
    for (int i = 0; i < initSize + 1; i++) {
      list.add(new ArrayList<Integer>());
    }
  }

  public List<Integer> getNode(int i) {
    return this.list.get(i);
  }

  public List<List<Integer>> getGraph() {
    return this.list;
  }

  public void setUndirectedEdge(int x, int y) {
    list.get(x).add(y);
    list.get(y).add(x);
  }

  public void setDirectedEdge(int x, int y) {
    list.get(x).add(y);
  }
}