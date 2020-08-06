package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    int[] memo = new int[11];
    memo[0] = 1;

    for (int i = 1; i<= 10; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i - j >= 0) {
          memo[i] += memo[i - j];
        }
      }
    }
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(memo[n]);
    }
  }
}
