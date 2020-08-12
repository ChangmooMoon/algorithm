package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_15649 {
  static boolean[] number_used = new boolean[10]; // true면 사용됨
  static int[] a = new int[8];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    String[]  s = br.readLine().split(" ");

    int n = Integer.parseInt(s[0]); // 1~n 까지의 자연수 // 4
    int m = Integer.parseInt(s[1]); // m개 고르는 순열 // 2

    backtrack_print(0, n, m);
  }

  static void backtrack_print(int index, int n, int m) {
    if (index == m) { //base case
      for (int i = 0; i < m; i++) {
        System.out.print(a[i]);
        if(i != m-1) System.out.print(' ');
      }
      System.out.println();
      return;
    } else { // recursion case
      for (int i = 1; i <= n; i++) {
        if(number_used[i]) continue;
        number_used[i] = true;
        a[index] = i;
        backtrack_print(index+1, n, m);
        number_used[i] = false;
      }
    }
  }
}
