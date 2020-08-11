package acmicpc;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJ_1107 {
  static boolean[] a = new boolean[10]; // true면 불가
  public static void main(String[] args) {
//    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 목표 채널
    int m = sc.nextInt(); // 고장숫자 갯수
    for (int i = 0; i < m; i++) {
      int brokenIdx = sc.nextInt();
      a[brokenIdx] = true;
    }

    int min_press_time = Math.abs(n - 100);  // 플마버튼만 누르는 경우
    for (int i = 0; i <= 1_000_000; i++) { // 숫자+플마버튼 누르는 경우
      if (possible_by_num(a, i)) {
        // 누른 횟수 = 숫자누른횟수 + 플마 누른 횟수
        int num_length = i == 0 ? 1 : (int) (Math.log10(i) + 1);
        int press_num = num_length + Math.abs(i - n);
        if (min_press_time > press_num) {
          min_press_time = press_num;
        }
      }
    }
    System.out.println(min_press_time);
  }

  static boolean possible_by_num(boolean[] arr, int a) { // a
    if (a == 0) {
      if (arr[0]) {
        return false;
      }
    }
    while (a != 0) {
      int check = a % 10;
      if (arr[check]) {
        return false;
      }
      a /= 10;
    }
    return true;
  }
}
