package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2529 {
  static String min = Integer.toString(Integer.MAX_VALUE);
  static String max = Integer.toString(Integer.MIN_VALUE);
  static int k;
  static char[] a; // 부등호
  static boolean[] c = new boolean[10]; // 0~9 사용기록 true
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    k = Integer.parseInt(br.readLine());
    a = br.readLine().toCharArray();
    make_formula(0, "");

    System.out.println(max);
    System.out.println(min);
  }

  static void make_formula(int now_k, String num) {
    if (now_k == k+1) {
      check(num);
      return;
    }

    for (int i = 0; i <= 9; i++) {
      if(c[i]) continue; // 사용한 넘버
      if (now_k == 0 || is_valid_calc(num.charAt(now_k - 1), (char) (i + '0'), a[now_k - 1])) {
        c[i] = true;
        make_formula(now_k + 1, num.concat(Integer.toString(i)));
        c[i] = false;
      }
    }
  }

  static void check(String num) {
    if (Long.parseLong(min) > Long.parseLong(num)) {
      min = num;
    }
    if (Long.parseLong(max) < Long.parseLong(num)) {
      max = num;
    }
  }

  static boolean is_valid_calc(char operand1, char operand2, char operator) {
    if (operator == '>') {
      return operand1 > operand2;
    }
    if (operator == '<') {
      return operand1 < operand2;
    }
    return false;
  }
}