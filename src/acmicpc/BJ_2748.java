package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2748 {
  static long[] a = new long[91];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(fib(n));
  }

  static long fib(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    if (a[n] == 0) {
      a[n] = fib(n - 1) + fib(n - 2);
    }
    return a[n];
  }
}
