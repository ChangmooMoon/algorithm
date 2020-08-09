package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9465 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine()); // 5
      long[][] a = new long[3][n+1];
      long[][] d = new long[3][n+1];

      for (int x = 1; x <= 2; x++) {
        st = new StringTokenizer(br.readLine(), " ");
        for (int y = 1; y <= n; y++) {
          a[x][y] = Integer.parseInt(st.nextToken());
        }
      }
      for (int m = 1; m <= n; m++) {
        d[0][m] = Math.max(Math.max(d[0][m - 1], d[1][m - 1]), d[2][m - 1]);
        d[1][m] = Math.max(d[0][m - 1], d[2][m - 1]) + a[1][m];
        d[2][m] = Math.max(d[0][m - 1], d[1][m - 1]) + a[2][m];
      }

      System.out.println(Math.max(Math.max(d[0][n], d[1][n]), d[2][n]));
    }
  }
}
