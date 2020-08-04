package acmicpc;

import java.util.Scanner;

public class BJ_10872 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 1;
    if (n == 0) {
      System.out.println(result);
    } else {
      while (n > 0) {
        result *= n;
        n--;
      }
      System.out.println(result);
    }
  }
}
