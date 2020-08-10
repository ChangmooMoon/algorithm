package acmicpc;

import java.util.Scanner;

public class BJ_1065 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for (int i = 1; i <= n; i++) { // 1~100 1~99는 맞음, 100은 아
      if (isSeq(i)) {
        result++;
      }
    }
    System.out.println(result);
  }

  static boolean isSeq(int n) { // 101
    if (n < 100) {
      return true;
    }
    int digit1 = n % 10;
    n /= 10;
    int digit2 = n % 10;
    int diff = digit1 - digit2;
    while (n >= 10) {
      digit1 = n % 10;
      n /= 10;
      digit2 = n % 10;
      if (digit1 - digit2 != diff) {
        return false;
      }
    }
    return true;
  }
}
