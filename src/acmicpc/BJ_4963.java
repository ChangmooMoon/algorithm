package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4963 {
  static int w, h;
  static int[][] map = new int[51][51];
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));

    while (true) {
      String[] s = br.readLine().split(" "); // w,h
      w = Integer.parseInt(s[0]);
      h = Integer.parseInt(s[1]);
      if (w == 0 && h == 0) {
        System.out.println(sb);
        return;
      }

      for (int i = 0; i < h; i++) {
        String[] row = br.readLine().split(" ");
        for (int j = 0; j < w; j++) {
          map[i][j] = Integer.parseInt(row[j]);
        }
      }

      int island_count = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (map[i][j] == 1) {
            dfs(i, j);
            island_count++;
          }
        }
      }
      sb.append(island_count + "\n");
    }
  }

  static void dfs(int x, int y) {
    if (x < 0 || y < 0 || x >= h || y >= w) {
      return;
    }
    if (map[x][y] == 0) {
      return;
    }

    map[x][y] = 0;
    dfs(x+1, y);
    dfs(x-1, y);
    dfs(x, y - 1);
    dfs(x, y + 1);
    dfs(x + 1, y + 1);
    dfs(x - 1, y - 1);
    dfs(x - 1, y + 1);
    dfs(x + 1, y - 1);
  }
}
