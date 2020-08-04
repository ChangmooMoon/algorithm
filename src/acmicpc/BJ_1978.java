package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int answer = 0;
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      int isPrime = Integer.parseInt(st.nextToken());
      if (prime_test(isPrime)) {
        answer++;
      }
    }
    System.out.println(answer);
  }

  static boolean prime_test(int n) {
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
