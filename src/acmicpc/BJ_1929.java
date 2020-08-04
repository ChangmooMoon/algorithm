package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수 구하기
public class BJ_1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] S = br.readLine().split(" ");
    int M = Integer.parseInt(S[0]);
    int N = Integer.parseInt(S[1]);

    for (int i = M; i <= N; i++) {
      if (is_prime(i)) {
        System.out.println(i);
      }
    }
  }

  static boolean is_prime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
