package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1707 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringTokenizer st;
    int k = Integer.parseInt(br.readLine()); // 테스트케이스

    while (k-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      int v = Integer.parseInt(st.nextToken()); // 정점의 개수
      int e = Integer.parseInt(st.nextToken()); // 간선의 개수
      List<Integer>[] a = new ArrayList[v + 1]; // 인접리스트
      for (int i = 0; i < e; i++) {
        a[i] = new ArrayList<Integer>();
      }
      for (int i = 0; i < e; i++) {
        st = new StringTokenizer(br.readLine(), " ");
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        a[v1].add(v2);
        a[v2].add(v1);
      }

      int[] group = new int[v + 1]; // v마다 0,1,2 그룹 정함
      for (int i = 1; i <= v; i++) {
        if (group[i] == 0) {
          dfs(a, group, i, 1);
        }
      }

      for (int i = 1; i <= v; i++) {
        for (int j : a[i]) {
          if (group[i] == group[j]) {
            System.out.println("NO");
            return;
          }
        }
      }
      System.out.println("Yes");
    }

  }

  static void dfs(List<Integer>[] a, int[] group, int index, int group_num) {
    group[index] = group_num;
    for (int y : a[index]) {
      if (group[y] == 0) {
        dfs(a, group, y, 3 - group_num);
      }
    }
  }
}
