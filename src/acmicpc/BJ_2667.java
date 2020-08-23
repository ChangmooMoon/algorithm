package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ_2667 {
  static int n;
  static int[][] house;
  static boolean[][] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    house = new int[n][n];
    visited = new boolean[n][n];
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      for (int j = 0; j < n; j++) {
        house[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int complex = dfs(i, j);
        if (complex != 0) {
          ans.add(complex);
        }
      }
    }

    Collections.sort(ans);
    System.out.println(ans.size());
    for (int i : ans) {
      System.out.println(i);
    }
  }

  static int dfs(int x, int y) {
    if (x < 0 || y < 0 || x >= n || y >= n) return 0;
    if (visited[x][y] || house[x][y] == 0) return 0;
    else {
      visited[x][y] = true;
      return 1 + dfs(x - 1, y) + dfs(x + 1, y) + dfs(x, y - 1) + dfs(x, y + 1);
    }
  }
}
