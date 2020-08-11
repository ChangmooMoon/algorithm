package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2309 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = 9;
    int[] kids = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int height = Integer.parseInt(br.readLine());
      kids[i] = height;
      sum += height;
    }

    Arrays.sort(kids);

    loop:
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if (sum == 100 + kids[i] + kids[j]) {
          for (int k = 0; k < n; k++) {
            if (k != i && k != j) {
              System.out.println(kids[k]);
            }
          }
          break loop;
        }
      }
    }
  }
}