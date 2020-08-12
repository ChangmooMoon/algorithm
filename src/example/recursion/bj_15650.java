package example.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bj_15650 {
  static int[] a = new int[8];
  static boolean[] c = new boolean[8];

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    int n = sc.nextInt(); // 4
    int m = sc.nextInt(); // 2
    // nPm (4P2)
    permutation(0, n, m);
  }

  static void permutation(int pos, int n, int m) {
    if (pos == m) {
      for (int i = 0; i < m; i++) {
        System.out.println(a[i]);
      }
    }

    for (int i = pos; i < m; i++) {

    }

  }
}
