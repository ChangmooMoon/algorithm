package acmicpc;

import java.io.*;

public class BJ_15651 {
  static int[] a = new int[8]; // 1~7
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]); // 4
    int m = Integer.parseInt(s[1]);// 2
    // 같은 수 여러번 골라도 됨 nPm 4P2
    permu(n, m, 0);
    System.out.println(sb);
  }

  static void permu(int n, int m, int now_m) throws IOException {
    if (now_m == m) { //
      for (int i = 0; i < m; i++) {
        sb.append(a[i]);
        if(i != m-1) sb.append(" ");
      }
      sb.append("\n");
    }

    // recursion case
    for (int i = 1; i <= n; i++) {
      a[now_m] = i; // a[0] = 1, a[1] =1
      if (now_m < m) {
        permu(n, m, now_m + 1);
      }
    }
  }
}
