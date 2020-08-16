package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_14391 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken()); //세로 2
    int m = Integer.parseInt(st.nextToken()); //가로 3
    int[][] paper = new int[n][m]; // [[1, 2, 3], [3, 1, 2]]
    for (int i = 0; i < n; i++) {
      String[] s = br.readLine().split("");
      for (int j = 0; j < m; j++) {
        paper[i][j] = Integer.parseInt(s[j]);
      }
    }
//    System.out.println(Arrays.deepToString(paper));



  }
}
