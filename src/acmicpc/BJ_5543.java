package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5543 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int burger = 0;
    int beverage = 0;
    for (int i = 0; i < 3; i++) {
      int b = Integer.parseInt(br.readLine());
      if (burger == 0 || burger > b) {
        burger = b;
      }
    }

    for (int i = 0; i < 2; i++) {
      int bev = Integer.parseInt(br.readLine());
      if (beverage == 0 || beverage > bev) {
        beverage = bev;
      }
    }
    System.out.println(burger + beverage - 50);
  }
}
