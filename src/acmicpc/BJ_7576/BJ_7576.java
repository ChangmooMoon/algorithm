package acmicpc.BJ_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos{
  int x, y;
  Pos(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class BJ_7576 {
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]); // 행
    int m = Integer.parseInt(s[1]); // 열
    Queue<Pos> q = new LinkedList<>();
    int[][] a = new int[m][n]; // 토마토 배열
    int[][] count = new int[m][n]; // 숙성일자 카운트
    boolean[][] visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      String[] s2 = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        a[i][j] = Integer.parseInt(s2[j]);
        if (a[i][j] == 1) {
          q.add(new Pos(i, j)); // 토마토 있는건 전부 큐에 넣음
          visited[i][j] = true;
        }
      }
    }

    while (!q.isEmpty()) {
      Pos p = q.remove();
      int x = p.x;
      int y = p.y;
      for (int i = 0; i < 4; i++) { // 4방향 숙성 멕이기
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (0 <= nx && nx < m && 0 <= ny && ny < n) {
          if (!visited[nx][ny] && a[nx][ny] == 0) { // 방문하지 않았고, a[nx][ny]가 0이면 간다
            q.add(new Pos(nx, ny));
            count[nx][ny] = count[x][y] + 1;
            visited[nx][ny] = true;
          }
        }
      }
    }

    int max = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!visited[i][j] && a[i][j] != -1) {
          System.out.println(-1);
          return;
        }
        max = Math.max(count[i][j], max);
      }
    }
    System.out.println(max);
  }
}
