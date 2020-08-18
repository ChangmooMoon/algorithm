package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9663 {
  static int n;
  static int count;
  static int[] mark;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    count = 0;
    mark = new int[n];

    backTracking(0);
    System.out.println(count);
  }

  static void backTracking(int row) { // row마다 퀸을 하나씩 두는 함수
    // base case
    if (row == n) {
      count++;
      return;
    }

    // recursion case
    for (int i = 1; i <= n; i++) { // row 순회
      if (checkColDiag(row, i)) {
        mark[row] = i; // mark idx => column, element => row
        backTracking(row + 1);
      }
    }
  }

  static boolean checkColDiag(int x, int y) { // 세로, 대각선 검사해서 겹치지 않으면 true
    for (int i = 0; i < x; i++) {
      if (mark[i] == y || Math.abs(x - i) == Math.abs(y - mark[i]))
        return false;
    }
    return true;
  }
}
