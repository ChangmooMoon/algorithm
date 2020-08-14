package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1316 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      boolean[] check = new boolean[26];
      for (int j = 0; j < s.length(); j++) {
        int k = s.charAt(j);
        check[k-97] = true;
        int l;
        if (j + 1 < s.length()) {
          l = s.charAt(j + 1);
          if(k == l) check[k-97] = false; // 사용되지 않은거라 가정
        }
      }
      System.out.println(Arrays.toString(check));
    }
  }
}
//        aba
//        abab
//        abcabc
//        a

