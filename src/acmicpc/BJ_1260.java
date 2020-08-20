package acmicpc;

import java.io.*;
import java.util.*;

public class BJ_1260 {
  static int n;
  static List<Integer>[] a;
  static boolean[] dfs_visit = new boolean[1001];
  static boolean[] bfs_visit = new boolean[1001];
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new  FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    n = Integer.parseInt(st.nextToken()); // 정점 갯수
    int m = Integer.parseInt(st.nextToken()); // 간선 갯수
    int start = Integer.parseInt(st.nextToken());

    a = new ArrayList[n + 1]; // 그래프 구현
    for (int i = 1; i <= n; i++) {
      a[i] = new ArrayList<>();
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int v1 = Integer.parseInt(st.nextToken());
      int v2 = Integer.parseInt(st.nextToken());
      a[v1].add(v2);
      a[v2].add(v1);
    }

    for (int i = 1; i <= n; i++) {
      Collections.sort(a[i]);
    }

    dfs(start);
    System.out.println(sb);
    sb.delete(0, sb.length());

    bfs(start);
    System.out.println(sb);
  }

  static void dfs(int start) {
    if(dfs_visit[start]) return;

    dfs_visit[start] = true;
    sb.append(start + " ");
    for (int i = 0; i < a[start].size(); i++) {
      int node = a[start].get(i);
      if (!dfs_visit[node]) {
        dfs(node);
      }
    }
  }

  static void bfs(int start) {
    bfs_visit[start] = true;
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(start);

    while (!queue.isEmpty()) {
      int pop = queue.remove();
      sb.append(pop + " ");
      for (int i = 0; i < a[pop].size(); i++) { // 여기서 각 노드별 인접리스트 순회
        int node = a[pop].get(i);
        if (!bfs_visit[node]) {
          bfs_visit[node] = true;
          queue.add(node);
        }
      }
    }
  }
}
