package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2156 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));

    int n = Integer.parseInt(br.readLine());
    long[] a = new long[n+1];
    long[][] d = new long[n + 1][3];
    for (int i = 1; i <= n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n && j <= 2; j++) {
        d[i][0] = Math.max(Math.max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
        d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[i];
        d[i][2] = d[i - 1][0] + a[i];
      }
    }

    System.out.println(Math.max(Math.max(d[n][0], d[n][1]),d[n][2]));
  }
}
