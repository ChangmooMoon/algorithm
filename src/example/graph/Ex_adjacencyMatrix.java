package example.graph;

import java.util.Arrays;

// adjacency matrix
public class Ex_adjacencyMatrix {
  public static void main(String[] args) {
    AdjMatrix adjMatrix = new AdjMatrix(6);
    adjMatrix.setUndirectedEdge(1, 2);
    adjMatrix.setUndirectedEdge(2, 4);
    adjMatrix.setUndirectedEdge(3, 6);
    adjMatrix.setUndirectedEdge(5, 6);
    adjMatrix.setDirectedEdge(2, 5);

    System.out.println(Arrays.deepToString(adjMatrix.getGraph()));
  }
}

class AdjMatrix {
  private int[][] matrix;

  public AdjMatrix(int initSize) {
    this.matrix = new int[initSize + 1][initSize + 1];
  }

  public int[][] getGraph() {
    return this.matrix;
  }

  public void setUndirectedEdge(int x, int y) {
    matrix[x][y] = matrix[y][x]= 1;
  }

  public void setDirectedEdge(int x, int y) {
    matrix[x][y] = 1;
  }
}