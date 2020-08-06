package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// top-down 재귀방식
public class BJ_1463 {
  static int[] memo = new int[1000001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    System.out.println(calcMin(n));
  }

  static int calcMin(int n) {
    if (n == 1) return 0;
    if (memo[n] > 0) return memo[n]; // 메모이제이션. 이전에 구했던 작은 문제
    memo[n] = calcMin(n-1) + 1;

    if (n % 2 == 0) {
      int tmp = calcMin(n / 2) + 1;
      if (memo[n] > tmp) {
        memo[n] = tmp;
      }
    }
    if (n % 3 == 0) {
      int tmp = calcMin(n / 3) + 1;
      if (memo[n] > tmp) {
        memo[n] = tmp;
      }
    }
    return memo[n];
  }
}
