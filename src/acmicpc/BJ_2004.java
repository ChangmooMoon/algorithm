package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2004 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int two_count = 0;
    int five_count = 0;

    // ex) 5C2 = 5! / ((5-2)! * 2!) 분자의 2, 5 갯수 - 분모의 2, 5 갯수 ==> 2, 5 중 적은 것의 갯수가 0의 갯수
    for (long i = 2; i <= n; i *= 2) {
      two_count += n/i;
    }
    for (long i = 2; i <= n - m; i *= 2) {
      two_count -= (n-m)/i;
    }
    for (long i = 2; i <= m; i *= 2) {
      two_count -= m/i;
    }
    for (long i = 5; i <= n; i *= 5) {
      five_count += n/i;
    }
    for (long i = 5; i <= n - m; i *= 5) {
      five_count -= (n-m)/i;
    }
    for (long i = 5; i <= m; i *= 5) {
      five_count -= m/i;
    }

    System.out.println(Math.min(two_count,five_count));
  }
}
