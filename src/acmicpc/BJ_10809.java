package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String s = br.readLine();
    int[] a = new int[26];

    for (int i = 0; i < a.length; i++) {
      a[i] = -1;
    }

    for (int i = 0; i < s.length(); i++) {
      int ascii = s.charAt(i);
      if (a[ascii - 97] == -1) {
        a[ascii - 97] = i;
      }
    }

    for (int i = 0; i < a.length; i++) {
      sb.append(a[i]).append(" ");
    }

    System.out.println(sb);
  }
}
