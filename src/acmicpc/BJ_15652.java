package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_15652 {
  static int[] a = new int[9]; // 1~8
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int n = Integer.parseInt(s[0]); // 1부터 n까지의 자연수
    int m = Integer.parseInt(s[1]); // 그 중 M개를 고르는 수열 nPm

    permutation(n, m, 0, 1);
  }

  static void permutation(int n, int m, int now_m, int startIdx) {
    if (now_m == m) {
      for (int i = 0; i < m; i++) {
        System.out.print(a[i]);
        if (i < m-1) {
          System.out.print(" ");
        }
      }
      System.out.println();
      return;
    }

    for (int i = startIdx; i <= n; i++) {
      a[now_m] = i;
       permutation(n, m, now_m+1, i);
    }
  }
}
