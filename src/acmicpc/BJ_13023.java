package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_13023 {
  static int n,m;
  static boolean[] visited;
  static List<Integer>[] graph;
  static boolean result;

  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    n = Integer.parseInt(s[0]); // 사람의 수
    m = Integer.parseInt(s[1]); // 친구관계의수
    graph = new ArrayList[n]; // 인접리스트
    for (int i = 0; i < n; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int i = 0; i < m; i++) {
      String[] rel = br.readLine().split(" ");
      int from = Integer.parseInt(rel[0]);
      int to = Integer.parseInt(rel[1]);
      graph[from].add(to);
      graph[to].add(from);
    }
    visited = new boolean[n]; // 방문여부
    result = false;

    for (int i = 0; i < n; i++) { // 사람 인덱스 0~n-1
      dfs(i, 1);
      if (result) {
        System.out.println(1);
        return;
      }
    }
    System.out.println(0);
  }

  static void dfs(int i, int depth) {
    if (depth == 5 || result) {  // base case
      result = true;
      return;
    }

    visited[i] = true;
    for (int j = 0; j < graph[i].size(); j++) {
      int nextNode = graph[i].get(j);
      if (!visited[nextNode]) {
        visited[nextNode] = true;
        dfs(nextNode, depth + 1);
        visited[nextNode] = false;
      }
    }
    visited[i] = false;
  }
}
