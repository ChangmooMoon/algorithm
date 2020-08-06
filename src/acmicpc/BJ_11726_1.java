package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11726_1 {
  static int[] memo = new int[1001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    memo[1] = 1;
    memo[2] = 2;

    for (int i = 3; i < n; i++) {
      memo[i] = (memo[i-1] + memo[i-2]) % 10007;
    }
    System.out.println(memo[n]);
  }
}
