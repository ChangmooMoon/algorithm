package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1676 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int five_count = 0;

    for (int i = 5; i <= n; i= i*5) {
      for (int j = 2; j <= n; j++) {
        if (j % i == 0) {
          five_count++;
        }
      }
    }
    System.out.println(five_count);
  }
}
