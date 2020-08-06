package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// bottom-top 반복문방식
public class BJ_1463_1 {
  static int[] memo = new int[1000001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    System.out.println(calcMin(n));
  }

  static int calcMin(int n) {
    memo[1] = 0;
    for (int i = 2; i <= n; i++) {
      memo[i] = memo[i - 1] + 1;
      if (i % 2 == 0 && memo[i] > memo[i / 2] + 1) {
        memo[i] = memo[i/2] + 1;
      }
      if (i % 3 == 0 && memo[i] > memo[i / 3] + 1) {
        memo[i] = memo[i / 3] + 1;
      }
    }

    return memo[n];
  }
}
