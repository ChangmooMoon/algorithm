package acmicpc;

import java.io.*;

public class BJ_11729 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());

    sb.append((1<<k)-1 + "\n");
    hanoi(1, 3, k);
    System.out.println(sb);
  }

  static void hanoi(int a, int b, int k) throws IOException { // begin, end, 원판갯수
    if (k == 1) {
      sb.append(a + " " + b + "\n");
      return;
    }
    hanoi(a, 6 - a - b, k - 1);
    sb.append(a + " " + b + "\n");
    hanoi(6 - a - b, b, k - 1);
  }
}
