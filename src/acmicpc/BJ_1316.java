package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    int n = Integer.parseInt(br.readLine());
    int result = 0;

    while (n-- > 0) {
      String s = br.readLine();
      if (check(s)) {
        result++;
      }
    }

    System.out.println(result);
  }

  static boolean check(String s) {
    boolean[] a = new boolean[26];

    for (int i = 0; i < s.length(); i++) {
      int chIdx = s.charAt(i) - 'a';
      if (a[chIdx]) {
        return false;
      }

      if (i < s.length() - 1 && chIdx != (int) s.charAt(i + 1) - 'a' ) {
        a[chIdx] = true;
      }
    }
    return true;
  }
}
