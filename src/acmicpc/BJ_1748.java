package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1748 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int new_num_length = 0;
    int length = 1;
    for (int i = 1; i <= n; i *= 10) {
      int i_digit = Math.min(n, i * 10 - 1); // i자릿수 갯수
      new_num_length += (i_digit - i + 1) * length;
      length++;
    }
    System.out.println(new_num_length);
  }
}