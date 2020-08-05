package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1110 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int newNum = n;
    int count = 0;

    while (true) {
      int unit_digit = newNum % 10; // 1의 자리 // 9
      int ten_digit = (newNum - unit_digit) / 10; // 10의 자리 // 0
      newNum = + unit_digit * 10 + (unit_digit + ten_digit) % 10;
      count++;
      if (newNum == n) {
        break;
      }
    }

    System.out.println(count);
  }
}
