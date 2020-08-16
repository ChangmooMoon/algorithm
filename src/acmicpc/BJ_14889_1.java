package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_14889_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int[][] s = new int[n][n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < n; j++) {
        s[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    make_team(s, n);
  }

  static void make_team(int[][] s, int n) {
    for (int i = 0; i < (1 << n); i++) { // 0000~1111
      Stack<Integer> team1 = new Stack<>();
      Stack<Integer> team2 = new Stack<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) > 0) { // i번째 집합에 j가 포함되어있으면 1팀, 아니면 2팀
          team1.push(j);
        } else {
          team2.push(j);
        }
      }
      if(team1.size() != n/2) continue; // 반갈 안됬으면 continue


    }
  }

  static int calc_diff(Stack<Integer> a, Stack<Integer> b) {
    int a_sum = 0;
    int b_sum = 0;
    while (a.isEmpty()) {
      a_sum += a.pop();
      b_sum += b.pop();
    }
    return Math.abs(a_sum - b_sum);
  }
}
