package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String[] abc = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
    String[] s = br.readLine().split("");

    int count = 0;
    int i = 0;
    while(i < s.length) { // s 문자열 ddz=z=
      boolean check = false;
      for (int j = 0; j < abc.length; j++) { // abc문자열
        if (i + 1 < s.length && (s[i] + s[i + 1]).equals(abc[j])) {
          count++;
          i += 2;
          check = true;
          break;
        }
      }

      if (!check && i+2 < s.length && (s[i] + s[i + 1] + s[i + 2]).equals("dz=")) {
        count++;
        i+=3;
        continue;
      }

      if (!check && i < s.length) {
        i+=1;
        count++;
      }
    }

    System.out.println(count);
  }
}
