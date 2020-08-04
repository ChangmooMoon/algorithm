package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2609 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] N = br.readLine().split(" ");
    int a = Integer.parseInt(N[0]);
    int b = Integer.parseInt(N[1]);

    System.out.println(GCD(a,b));
    System.out.println(LCM(a,b));
  }

  static int GCD(int x, int y) {
    if (y == 0) {
      return x;
    } else {
      return GCD(y, x%y);
    }
  }

  static int LCM(int x, int y) {
    return x * y / GCD(x, y);
  }
}
