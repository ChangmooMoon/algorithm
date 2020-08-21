package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018 {
  static char[][] board = new char[51][51];
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
      String line = br.readLine();
      for (int j = 0; j < m; j++) {
        board[i][j] = line.charAt(j);
      }
    }
    int result = 65;
    for (int i = 0; i <= n - 8; i++) {
      for (int j = 0; j <= m - 8; j++) {

        int count = 0;
        for (int y = i; y < i + 8; y++) {
          for (int x = j; x < j + 8; x++) {
            if ((y + x) % 2 == 0) { // 홀짝,짝홀 - 홀홀,짝짝
              if (board[y][x] == 'W') count++;
            } else {
              if(board[y][x] == 'B') count++;
            }
          }
        }
        result = Math.min(result, count);
        result = Math.min(result, 64 - count);
      }
    }
    System.out.println(result);
  }
}
