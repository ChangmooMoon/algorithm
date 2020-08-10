package acmicpc;

import java.util.Scanner;

public class BJ_11720 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    System.out.println(sum);
  }
}
