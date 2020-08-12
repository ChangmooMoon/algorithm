package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_15650_1 {
  static int[] a = new int[8];

  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    print_permu(1, 0, n, m);
  }

  static void print_permu(int index,int selected, int n, int m) {
    // base case
    if (selected == m) {
      for (int i = 0; i < m; i++) {
        System.out.print(a[i]);
        if (i != m - 1) System.out.print(' ');
      }
      System.out.println();
      return;
    }
    // recursion case
    if (index > n) {
      a[selected] = index;
      print_permu(index + 1, selected + 1, n, m);
      a[selected] = 0;
      print_permu(index + 1, selected, n, m);
    }
  }
}