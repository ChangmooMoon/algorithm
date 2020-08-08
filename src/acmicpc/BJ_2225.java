package acmicpc;

import java.util.Scanner;

public class BJ_2225 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[][] d = new int[k + 1][n + 1];

    // d[K][N] = d[K-1][N-L]의 모든 합
    d[0][0] = 1;
    for (int i = 1; i <= k; i++) { // K
      for (int j = 0; j <= n; j++) { // N
        for (int l = 0; l <= j; l++) { /// L
          d[i][j] += d[i - 1][j - l];
          d[i][j] %= 1_000_000_000;
        }
      }
    }

    System.out.println(d[k][n]);
  }
}
