package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine().toUpperCase();
    int[] a = new int[26];
    for (int i = 0; i < s.length(); i++) {
      int ascii = s.charAt(i);
      a[ascii - 65]++;
    }

    int max = -1;
    int maxIdx = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0 && max < a[i]) {
        max = a[i];
        maxIdx = i;
      }
    }

    for (int i = 0; i < a.length; i++) {
      if (maxIdx != i && max == a[i]) {
        System.out.println("?");
        return;
      }
    }
    System.out.println((char)(maxIdx+65));
  }
}
