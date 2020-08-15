package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_14889 {
  static int min = Integer.MAX_VALUE;
  static int n;
  static int[][] s;
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    s = new int[n][n];
    Stack<Integer> team_1 = new Stack<>();
    Stack<Integer> team_2 = new Stack<>();
    for (int i = 0; i < n; i++) {
      String[] str = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        s[i][j] = Integer.parseInt(str[j]);
      }
    }
    choose_team(team_1, team_2, 0);
    System.out.println(min);
  }

  static void choose_team(Stack<Integer> s1, Stack<Integer> s2, int now_idx) {
    if (now_idx == n) {
      if (s1.size() != s2.size()) return;
      min = Math.min(calc_diff(s1, s2), min);
      return;
    }

    s1.push(now_idx);
    choose_team(s1, s2, now_idx + 1);
    s1.pop();
    s2.push(now_idx);
    choose_team(s1, s2, now_idx + 1);
    s2.pop();
  }

  static int calc_diff(Stack<Integer> s1, Stack<Integer> s2) {
    int team1_sum = 0;
    int team2_sum = 0;
    int[] arr1 = s1.stream().mapToInt(i -> i).toArray(); //[0,1,2]
    int[] arr2 = s2.stream().mapToInt(i -> i).toArray(); // [3,4,5]
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        if (i != j) {
          team1_sum += s[arr1[i]][arr1[j]];
          team2_sum += s[arr2[i]][arr2[j]];
        }
      }
    }
    return Math.abs(team1_sum - team2_sum);
  }
}
