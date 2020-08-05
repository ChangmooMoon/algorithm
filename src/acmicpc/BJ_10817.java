package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10817 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int first = 0;
    int second = 0;

    for (int i = 0; i < s.length; i++) {
      int element = Integer.parseInt(s[i]);
      if (element >= first) {
        second = first;
        first = element;
      }
      if (first > element && element > second) {
        second = element;
      }
    }

    System.out.println(second);
  }
}
