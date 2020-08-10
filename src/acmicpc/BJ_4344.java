package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int c = Integer.parseInt(br.readLine());
    for (int i = 0; i < c; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int n = Integer.parseInt(st.nextToken());
      int a[] = new int[n];
      int sum = 0;
      int upperAvg = 0;
      for (int j = 0; j < n; j++) {
        int element = Integer.parseInt(st.nextToken());
        a[j] = element;
        sum += element;
      }
      int avg = sum / n;
      for (int j = 0; j < n; j++) {
        if (avg < a[j]) {
          upperAvg++;
        }
      }
      System.out.println((String.format("%.3f", (float)upperAvg / n * 100)) + '%');
    }
  }
}
