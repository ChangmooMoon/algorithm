package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      if ('A' <= s.charAt(i) && s.charAt(i) <= 'C') {
        sum += 3;
      }
      if ('D' <= s.charAt(i) && s.charAt(i) <= 'F') {
        sum += 4;
      }
      if ('G' <= s.charAt(i) && s.charAt(i) <= 'I') {
        sum += 5;
      }
      if ('J' <= s.charAt(i) && s.charAt(i) <= 'L') {
        sum += 6;
      }
      if ('M' <= s.charAt(i) && s.charAt(i) <= 'O') {
        sum += 7;
      }
      if ('P' <= s.charAt(i) && s.charAt(i) <= 'S') {
        sum += 8;
      }
      if ('T' <= s.charAt(i) && s.charAt(i) <= 'V') {
        sum += 9;
      }
      if ('W' <= s.charAt(i) && s.charAt(i) <= 'Z') {
        sum += 10;
      }
    }
    System.out.println(sum);
  }
}
