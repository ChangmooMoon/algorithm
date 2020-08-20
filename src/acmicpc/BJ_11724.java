package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_11724 {
  static int N;
  static int M;
  static boolean[] visited;
  static List<Integer>[] a;
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    N = Integer.parseInt(st.nextToken()); // 정점갯수
    M = Integer.parseInt(st.nextToken()); // 간선갯수
    a = new ArrayList[N+1]; // 인접리스트 작성
    for (int i = 1; i <= N; i++) {
      a[i] = new ArrayList<>();
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int v1 = Integer.parseInt(st.nextToken());
      int v2 = Integer.parseInt(st.nextToken());
      a[v1].add(v2);
      a[v2].add(v1);
    }
    visited = new boolean[N + 1];

    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        dfs(i);
        count++;
      }
    }
    System.out.println(count);
  }

  static void dfs(int n) {
    if(visited[n]) return;

    visited[n] = true;
    for (int node : a[n]) {
      if (!visited[node]) {
        dfs(node);
      }
    }
  }
}
