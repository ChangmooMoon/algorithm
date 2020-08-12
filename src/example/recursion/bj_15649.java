package example.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bj_15649 {
  static int[] a = new int[9]; // 1~8 자연수
  static boolean[] ch = new boolean[9]; // boolean checker

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    int n = sc.nextInt();
    int m = sc.nextInt();

    permutation(0, n, m);
    // (0,4,2) -> (1,4,2) -> (2,4,2) 이후 역순으로 콜스택 반환
  }

  // 4P2 일때 n=4, m=2이고 position은 1,2의 경우를 출력해야됨
  static void permutation(int pos, int n, int m) {
    if (pos == m) {
      for (int i = 0; i < m; i++) {
        System.out.print(a[i]);
        if(i < m-1) System.out.print(' ');
      }
      System.out.println();
    }

    for (int i = 1; i <= n; i++) {
      if(ch[i]) continue;
      ch[i] = true;
      a[pos] = i;
      permutation(pos + 1, n, m);
      ch[i] = false;
    }
  }
}
