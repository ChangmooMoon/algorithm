package example.recursion;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_small {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    float a,b,c;
    float d1 = Long.parseLong(s[0]); // 4
    float d2 = Long.parseLong(s[1]); // 4
    float d3 = Long.parseLong(s[2]); // 4

    float sum = (d1 + d2 + d3);
    a = (sum - 2 * d3) / 2;
    b = (sum - 2 * d2) / 2;
    c = (sum - 2 * d1) / 2;

    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println(-1);
    } else {
      System.out.println(1);
      System.out.format("%.1f %.1f %.1f", a,b,c);
    }
  }
}
