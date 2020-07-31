package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_9012 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      int axis = 0;
      boolean flag = true;
      String str = br.readLine();
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
          ++axis;
        } else {
          --axis;
        }
        if (axis < 0) {
          flag = false;
        }
      }

      if (flag && axis == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

  }
}
