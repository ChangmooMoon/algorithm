package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9465 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int[][] a = new int[n+1][3];
      int[][] d = new int[n+1][3];

      for (int k = 1; k <= 2; k++) {
        st = new StringTokenizer(br.readLine(), " ");
        for (int l = 1; l <= n; l++) {
          a[l][k] = Integer.parseInt(st.nextToken());
        }
      }

      for (int j = 2; j <= n; j++) {
        d[j][0] += Math.max(Math.max(a[j - 1][0], a[j - 1][1]), a[j - 1][2]);
        d[j][1] += Math.max(a[j-1][0], a[j-1][2]);
        d[j][2] += Math.max(a[j-1][0], a[j-1][1]);
      }

      System.out.println(d[n][0]);
      System.out.println(d[n][1]);
      System.out.println(d[n][2]);

    }

  }
}
