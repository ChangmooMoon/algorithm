package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11727 {
  static int[] memo = new int[1001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    System.out.println(tiling(n));
  }

  static int tiling(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 3;
    }
    if (memo[n] > 0) {
      return memo[n];
    }

    memo[n] = (tiling(n - 1) + tiling(n - 2) * 2) % 10007;
    return memo[n];
  }
}
