package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int i = 0;
    while (++i > 0) {
      int ai = (int) (3 * Math.pow(i, 2) - 3 * i + 1);
      if (ai >= n) {
        System.out.println(i);
        return;
      }
    }
  }
}
