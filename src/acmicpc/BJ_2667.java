package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_2667 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] matrix = new int[n][n];
    List<ArrayList<Integer>> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String[] s = br.readLine().split("");
      for (int j = 0; j < n; j++) {
        matrix[i][j] = Integer.parseInt(s[j]);
      }
    }
  }

  static void dfs(int x, int y, int count) {

  }
}
