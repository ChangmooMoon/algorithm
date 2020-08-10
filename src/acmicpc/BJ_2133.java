package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class BJ_2133 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    long[] d = new long[n + 1];
    d[0] = 1;
    if (n > 1) {
      d[2] = 3;
    }
    if (n >= 1) {
      for (int i = 4; i <= n; i += 2) {
        d[i] = d[i - 2] * 3;
        for (int j = 4; i >= j; j += 2) {
          d[i] = d[i] + d[i - j] * 2;
        }
      }

//      System.out.println(Arrays.toString(d));
      System.out.println(d[n]);
    }
  }
}