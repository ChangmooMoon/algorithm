package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_17404 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int[][] a = new int[n+1][3];
    int[][] d = new int[n+1][3];
    int result = 10_000_001;

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < 3; j++) {
        a[i][j] = Integer.parseInt(st.nextToken());
      }
    }

//    System.out.println(Arrays.deepToString(a));

    for (int f = 0; f <= 2; f++) { // first house color
      for (int j = 0; j <= 2; j++) { //
        if (f == j) {
          d[1][j] = a[1][j];
        } else {
          d[1][j] = 1000001;
        }
      }
//      System.out.println(Arrays.deepToString(d));

      for (int i = 2; i <= n; i++) {
        d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + a[i][0];
        d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + a[i][1];
        d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + a[i][2];
      }

      for (int j = 0; j <= 2; j++) { // 1번집과 n번집 컬러 비교하고 다르면 최소값찾
        if (f == j) {
          continue;
        } else {
          result = Math.min(result, d[n][j]);
        }
      }
    }
    System.out.println(result);
  }
}
