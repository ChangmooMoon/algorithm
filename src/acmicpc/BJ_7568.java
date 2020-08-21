package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_7568 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int a[][] = new int[n][3];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      a[i][0] = Integer.parseInt(st.nextToken());
      a[i][1] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < a.length; i++) {
      int count = 1;
      for (int j = 0; j < a.length; j++) {
        if (a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
          count++;
        }
      }
      a[i][2] = count;
    }

    for (int i = 0; i < a.length; i++) {
      sb.append(a[i][2] + " ");
    }
    System.out.println(sb);
  }
}
