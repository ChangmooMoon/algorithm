package acmicpc;

import java.util.Scanner;

public class BJ_8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String s = sc.next();
      int isInARow = 1;
      int point = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'O') {
          point += isInARow;
          isInARow++;
        } else {
          isInARow = 1;
        }
      }
      System.out.println(point);
    }
  }
}
