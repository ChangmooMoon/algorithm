package acmicpc;

import java.io.*;

public class BJ_9613 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine()); // 1~100
    for (int i = 0; i < t; i++) {
      long sum = 0;
      String[] s = br.readLine().split(" ");
      int test_case = Integer.parseInt(s[0]); // 2~100

      for (int j = 1; j <= test_case - 1; j++) {
        for (int k = j + 1; k <= test_case; k++) {
          sum += GCD(Integer.parseInt(s[j]), Integer.parseInt(s[k]));
        }
      }
      bw.write(sum + "\n");
    }
    bw.flush();
  }

  static int GCD(int x, int y) {
    while (y != 0) {
      int r = x % y;
      x = y;
      y = r;
    }
    return x;
  }
}
