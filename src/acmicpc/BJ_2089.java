package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 진법 변환 문제
public class BJ_2089 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    while (true) {
      int remainder = n % -2;
      if (remainder < 0) {
        remainder *= -1;
      }
      sb.append(remainder);
      n = (n -remainder) / -2;

      if (n == 0) {
        break;
      }
    }

    System.out.println(sb.reverse());
  }
}

// 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001
