package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] d = new int[10];
    int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
    String s = Integer.toString(n);
    for (int i = 0; i < s.length(); i++) {
      d[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
    }
    for (int i = 0; i < 10; i++) {
     System.out.println(d[i]);
    }
  }
}
