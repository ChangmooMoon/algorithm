package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      String s = Integer.toString(i);
      int sum = i;
      for (int j = 0; j < s.length(); j++) {
        sum += Integer.parseInt(String.valueOf(s.charAt(j)));
      }
      if (sum == n) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(0);
  }
}
