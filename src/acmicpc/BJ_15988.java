package acmicpc;

import java.util.Scanner;

public class BJ_15988 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    long[] d = new long[1_000_001];

    d[0] = 1;
    d[1] = 1;
    d[2] = 2;
    d[3] = 4;
    for (int i = 4; i < d.length; i++) {
      d[i] = (d[i - 1] + d[i - 2] + d[i - 3]) % 1_000_000_009 ;
    }

    for (int i = 0; i < T; i++) {
      int n = sc.nextInt();
      System.out.println(d[n]);
    }
  }
}