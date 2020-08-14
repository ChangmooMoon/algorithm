package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1074 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int n = Integer.parseInt(s[0]); // 가로세로 2^n 칸 1~15
    int r = Integer.parseInt(s[1]); // r,c <= 2^n -1
    int c = Integer.parseInt(s[2]);//  (r,c)를 몇번째로 방문하는가??

    int result = findNth(n, r, c);
    System.out.println(result);
  }

  static int findNth(int n, int i, int j) {
    if (n == 0) {
      return 0;
    }
    int half = 1 << (n - 1);
    if (i < half && j < half) { // 1사분면
      return findNth(n-1, i, j);
    }
    if (i < half && half <= j) { // 3사분면
      return half * half + findNth(n - 1, i, j - half);
    }

    if (half <= i && j < half) { // 2사분면
      return 2 * half * half + findNth(n - 1, i - half, j);
    } else return 3 * half * half + findNth(n - 1, i - half, j - half);
  }
}
