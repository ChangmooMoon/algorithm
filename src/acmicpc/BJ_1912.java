package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1912 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] D = new int[n];

    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (i == 0) {
        D[i] = a;
      } else {
        D[i] = Math.max(a, D[i - 1] + a);
      }
    }

    int max = D[0];
    for (int i = 1; i < n; i++) {
      if (max < D[i]) {
        max = D[i];
      }
    }

    System.out.println(max);
  }
}
