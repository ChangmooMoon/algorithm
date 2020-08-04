package acmicpc;

import java.io.*;

public class BJ_1934 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String[] N = br.readLine().split(" ");
      int a = Integer.parseInt(N[0]);
      int b = Integer.parseInt(N[1]);
      bw.write((a*b / GCD(a,b)) + "\n");
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
