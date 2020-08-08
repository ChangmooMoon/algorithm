package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1309 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] d = new int[2 * n + 1][3];

    d[0][0] = 1;
    for (int i = 1; i <= n; i++) {
      d[i][0] = (d[i - 1][0] + d[i - 1][1] + d[i - 1][2]) % 9901;
      d[i][1] = (d[i - 1][0] + d[i - 1][2]) % 9901;
      d[i][2] = (d[i - 1][0] + d[i - 1][1]) % 9901;
    }

    System.out.println((d[n][0] + d[n][1] + d[n][2]) % 9901);
  }
}

