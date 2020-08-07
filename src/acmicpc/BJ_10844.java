package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10844 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    long[][] d = new long[101][10];
    long sum = 0;

    for (int i = 1; i <= 9; i++) {
      d[1][i] = 1;
    }

    for (int i = 2; i <= n; i++) {
      for (int j = 0; j <= 9; j++) {
        if (j >= 1) {
          d[i][j] += d[i - 1][j - 1];
        }
        if (j <= 8) {
          d[i][j] += d[i - 1][j + 1];
        }
        d[i][j] %= 1_000_000_000;
      }
    }

    for (int i = 0; i <= 9; i++) {
      sum += d[n][i];
      sum %= 1_000_000_000;
    }

    System.out.println(sum);
  }
}
