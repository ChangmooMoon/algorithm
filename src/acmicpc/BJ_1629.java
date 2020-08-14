package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1629 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] s = br.readLine().split(" ");
    long a = Integer.parseInt(s[0]);
    long b = Integer.parseInt(s[1]);
    long c = Integer.parseInt(s[2]);
    // (a^b)% c 구하기
    System.out.println(func(a, b, c));
  }

  static long func(long a, long b, long c) { // (a^b) % c
    if (b == 1) {
      return a % c;
    }

    long result = func(a, b / 2, c);
    result = result * result % c;
    if (b % 2 == 0) {
      return result;
    }
    return result * a % c;
  }
}
