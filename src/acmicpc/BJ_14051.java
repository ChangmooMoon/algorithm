package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14051 {
  private static int n;
  private static int[] t;
  private static int[] p;
  private static int max = 0;
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine()); // 7
    t = new int[n]; // 3 5 1 1 2 4 2
    p = new int[n]; // 10 20 10 20 15 40 200\
    for (int i = 0; i < n; i++) {
      String[] s = br.readLine().split(" ");
      t[i] = Integer.parseInt(s[0]);
      p[i] = Integer.parseInt(s[1]);
    }
    calc_max(0, 0);
    System.out.println(max);
  }

  static void calc_max(int now_day, int now_sum) {
    if (now_day > n) return; // now_day -> 0~n까지 일 가능
    if (now_day == n) { // n+1이 되면 퇴사
      max = Math.max(max, now_sum);
      return;
    }

    calc_max(now_day + 1, now_sum);
    calc_max(now_day + t[now_day], now_sum + p[now_day]);
  }

}
