package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_14002 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine()); // 1 <= 수열 A의 크기 N <= 1000
    st = new StringTokenizer(br.readLine(), " ");
    int[] a = new int[n]; // 수열 A
    int[] d = new int[n]; // a[i]를 마지막으로 하는 LIS 길이
    int[] v = new int[n]; // v[i]는 a[i] 앞에 오는 index

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
      d[i] = 1;
      for (int j = 0; j < i; j++) {
        if (a[j] < a[i] && d[i] < d[j] + 1) {
          d[i] = d[j] + 1;
          v[i] = j;
        }
      }
    }

    sb.append(arrayMax(d) + "\n");
    int maxD = arrayMax(d);
    int[] LIS = new int[maxD+1];

    while (maxD >= 0) {
      LIS[maxD] = a[maxD];
      maxD--;
    }

    for (int i = 0; i < LIS.length; i++) {
      sb.append(LIS[i] + " ");
    }

    System.out.println(sb);
  }

  static int arrayMax(int[] arr) {
    int max = -1;
    for (int x : arr) {
      max = Math.max(max, x);
    }
    return max;
  }
}
