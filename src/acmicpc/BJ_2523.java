package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2523 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); // 3

    for (int i = 1; i <= 2 * n - 1; i++) {
      int count = i > n ? 2*n-i : i;
      while (count-- > 0) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
