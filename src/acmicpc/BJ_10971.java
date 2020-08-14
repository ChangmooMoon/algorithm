package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10971 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;

    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < n; j++) {
        a[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int result = min_cost();
  }
}
