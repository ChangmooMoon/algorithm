package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1932 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int[][] a = new int[n + 1][n + 1];
    int[][] d = new int[n + 1][n + 1];

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 1; j <= i; j++) {
        a[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - 1]) + a[i][j];
      }
    }

    int max = -1;
    for (int i = 1; i <= n; i++) {
      if (max < d[n][i]) {
        max = d[n][i];
      }
    }

    System.out.println(max);
  }
}
