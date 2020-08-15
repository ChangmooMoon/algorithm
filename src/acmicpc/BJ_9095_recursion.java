package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095_recursion {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine()); // 이걸 1,2,3의 합으로 만들어
      int result = calc(0, 0, n);
      System.out.println(result);
    }
  }

  static int calc(int count, int sum, int goal) {
    if (sum > goal) return 0; // 도달 못하는 케이스
    if (sum == goal) return 1; // 도달한 케이스

    int now_sum = 0;
    for (int i = 1; i <= 3; i++) {
      now_sum += calc(count + 1, sum + i, goal);
    }
    return now_sum;
  }
}
