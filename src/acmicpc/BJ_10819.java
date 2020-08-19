package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10819 {
  static int[] a;
  static int prev;
  static int sum = 0;
  static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    a = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    backtracking(n,0);
    System.out.println(sum);
  }

  static void backtracking(int n, int prev) {
    if (n == 0) {

    }
  }
}
