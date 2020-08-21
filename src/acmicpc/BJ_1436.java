package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1436 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int start = 665;
    int count = 0;

    while (start++ >0) {
      int tmp = start;
      boolean is_666num = false;
      while (tmp > 0) {
        if (tmp % 1000 == 666) {
          is_666num = true;
        }
        tmp /= 10;
      }

      if (is_666num) {
        count++;
      }

      if (count == n) {
        System.out.println(start);
        break;
      }
    }
  }
}
