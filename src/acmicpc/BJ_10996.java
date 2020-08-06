package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10996 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= 2 * n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print((i + j) % 2 == 0 ? '*' : ' ');
      }
      System.out.println();
    }
  }
}
