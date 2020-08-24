package acmicpc.BJ_2178;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
  int x, y;
  Pos(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class BJ_2178 {
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int[][] a = new int[n][m];
    boolean[][] visited = new boolean[n][m];
    int[][] count = new int[n][m];

    for (int i = 0; i < n; i++) {
      String s2 = br.readLine();
      for (int j = 0; j < m; j++) {
        a[i][j] = s2.charAt(j) - '0';
      }
    }
    Queue<Pos> q = new LinkedList<>();
    q.add(new Pos(0, 0)); // 출발지
    visited[0][0] = true;
    while (!q.isEmpty()) {
      Pos p = q.remove();
      int x = p.x;
      int y = p.y;
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (0 <= nx && nx < n && 0 <= ny && ny < m) { // 행, 열(0,1)(0,-1)(1,0)(-1,0) 이동
          if (!visited[nx][ny] && a[nx][ny] == 1) { // 방문 안했던 길인 경우
            q.add(new Pos(nx, ny));
            count[nx][ny] = count[x][y] + 1;
            visited[nx][ny] = true;
          }
        }
      }
    }

    System.out.println(count[n-1][m-1] + 1);
  }
}
