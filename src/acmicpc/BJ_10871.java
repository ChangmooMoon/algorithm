package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10871 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int x = Integer.parseInt(s[1]);

    String[] s2 = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      if (Integer.parseInt(s2[i]) < x) {
        sb.append(s2[i]).append(" ");
      }
    }

    System.out.println(sb);
  }
}
