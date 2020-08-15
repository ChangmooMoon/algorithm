package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_10870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    System.out.println(fibo(n));
  }

  static BigInteger fibo(int n) {
    BigInteger[] a = new BigInteger[n+1];
    if (n >= 1) a[1] = BigInteger.valueOf(1);
    if (n >= 2) a[2] = BigInteger.valueOf(1);
    for (int i = 3; i <= n; i++) {
      a[i] = a[i - 2].add(a[i - 1]);
    }

    return a[n];
  }
}
