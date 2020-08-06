package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095 {
  static int[] memo = new int[11];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(calc_onetwothree(n));
    }
  }

  static int calc_onetwothree(int n) {
    if(n == 1) return 1;
    if(n == 2) return 2;
    if(n == 3) return 4;
    if (memo[n] > 0) {
      return memo[n];
    }
    memo[n] = calc_onetwothree(n - 1) + calc_onetwothree(n - 2) + calc_onetwothree(n - 3);
    return memo[n];
  }
}
