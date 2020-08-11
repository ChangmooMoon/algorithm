package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_6064 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringTokenizer st;

    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int m = Integer.parseInt(st.nextToken());
      int n = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken()) - 1;
      int y = Integer.parseInt(st.nextToken()) - 1;

      int available = -1;
      for (int j = x; j <= m*n; j+=m) {
        if (j % n == y) {
          available = j+1;
          break;
        }
      }
      System.out.println(available);
    }
  }
}
