package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1212 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String n = br.readLine();
    for (int i = 0; i < n.length(); i++) {
      int hex = Integer.parseInt(String.valueOf(n.charAt(i)));

      while (hex > 0) {
        sb.append(hex % 2);
        hex /= 2;
      }

    }
    System.out.println(sb.reverse());
  }
}
