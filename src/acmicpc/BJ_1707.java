package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BJ_1707 {
  static int[] a = new int[20001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    int k = Integer.parseInt(br.readLine());
    for (int i = 0; i < k; i++) {
      String[] s = br.readLine().split(" ");
      int vertax = Integer.parseInt(s[0]);
      int edge = Integer.parseInt(s[1]);
    }
  }
}
