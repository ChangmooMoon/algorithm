package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2447 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        addStar(i, j, n);
      }
      sb.append('\n');
    }
    System.out.println(sb);
  }

  static void addStar(int row, int col, int n) {
    if ((row / n) % 3 == 1 && (col / n) % 3 == 1) {
      sb.append(' ');
    } else {
      if (n / 3 == 0)
        sb.append('*');
      else
        addStar(row, col, n / 3);
    }
  }
}