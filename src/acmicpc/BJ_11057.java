package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11057 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] d = new int[n + 1][10];

    for (int i = 0; i <= 9; i++) {
      d[1][i] = 1;
    }

    for (int i = 2; i<= n; i++) {
      for (int j = 0; j <= 9; j++) {
        for (int k = 0; k <= j; k++) {
          d[i][j] += d[i - 1][k] % 10_007;
        }
      }
    }

    int sum = 0;
    for (int i = 0; i <= 9; i++) {
      sum += d[n][i] % 10_007; // 10 11 12 13 ~ 19
    }
    System.out.println(sum % 10_007);
  }
}
