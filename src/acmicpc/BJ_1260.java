//package acmicpc;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class BJ_1260 {
//  static int n, m, v;
//  static List<Integer>[] graph;
//  static boolean[] visited;
//  static StringBuilder sb;
//
//  static void dfs(int v) {
//    if (visited[v]) {
//      return;
//    }
//    visited[v] = true;
//    sb.append(v + " ");
//    for (int i : graph[v]) {
//      if (!visited[i]) {
//        dfs(i);
//      }
//    }
//  }
//
//  static void bfs(int v) {
//    Queue<Integer> queue = new LinkedList<>();
//    queue.add(v);
//    visited[v] = true;
//    while (!queue.isEmpty()) {
//      int x = queue.poll();
//      sb.append(x + " ");
//      for (int i : visited[x]) {
//
//      }
//    }
//  }
//
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
////    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    n = Integer.parseInt(st.nextToken()); // 정점
//    m = Integer.parseInt(st.nextToken()); // 간선
//    v = Integer.parseInt(st.nextToken()); // 시작하는 정점
//
//    graph = new ArrayList[n + 1];
//    for (int i = 1; i <= n; i++) {
//      graph[i] = new ArrayList<>();
//    }
//    for (int i = 0; i < m; i++) {
//      String[] edge = br.readLine().split(" ");
//      int from = Integer.parseInt(edge[0]);
//      int to = Integer.parseInt(edge[1]);
//      graph[from].add(to);
//      graph[to].add(from);
//    }
//
//    for (int i = 1; i <= n; i++) {
//      Collections.sort(graph[i]);
//    }
//
//    visited = new boolean[m+1];
//
//    sb = new StringBuilder();
//
//    dfs(v);
//    sb.append("\n");
//    Arrays.fill(visited, false);
//    bfs(v);
//
//    System.out.println(sb);
//  }
//}
