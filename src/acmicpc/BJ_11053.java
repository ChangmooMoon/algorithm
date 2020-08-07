package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.StringTokenizer;


public class BJ_11053 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] a = new int[n]; // 전체 수열 A
    int[] d = new int[n]; // A[i]까지에서의 증가수열 길이 D
    for (int i = 0; i < n; i++) {
      d[i] = 1;
      a[i] = Integer.parseInt(st.nextToken());
      for (int j = 0; j < i; j++) { // d[i] = max(d[j]) + 1
        if (a[j] < a[i] && d[i] < d[j] + 1) {
          // d[j]가 제일 큰 부분수열길이
          d[i] = d[j] + 1;
        }
      }
    }

    IntSummaryStatistics stat = Arrays.stream(d).summaryStatistics();
    System.out.println(stat.getMax());
  }
}
