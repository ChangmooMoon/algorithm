package acmicpc;

import java.io.*;

public class BJ_1007 {
  static int[] ax;
  static int[] ay;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    ax = new int[20];
    ay = new int[20];
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      for (int j = 0; j < n; j++) {
        String[] s = br.readLine().split(" ");
        ax[j] = Integer.parseInt(s[0]);
        ay[j] = Integer.parseInt(s[1]);
      }
    }
  }
}
