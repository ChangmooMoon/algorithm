package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_13398 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] a = new int[n];
    int[] d1 = new int[n]; // i에서 끝나는 연속합
    int[] d2 = new int[n]; // i에서 시작하는 연속합

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < n; i++) {
      d1[i] = a[i];
      if (i == 0) continue;
      int pSum = d1[i - 1] + a[i];
      if (d1[i] < pSum) {
        d1[i] = pSum;
      }
    }

    for (int i = n - 1; i >= 0; i--) {
      d2[i] = a[i];
      if(i == n - 1) continue;
      int pSum = d2[i + 1] + a[i];
      if (d2[i] < pSum) {
        d2[i] = pSum;
      }
    }

//    System.out.println(Arrays.toString(a));
//    System.out.println(Arrays.toString(d1));
//    System.out.println(Arrays.toString(d2));

    int max = d1[0];
    for (int i = 1; i < n; i++) {
      if (max < d1[i]) {
        max = d1[i];
      }
    }
    for (int i = 1; i < n - 1; i++) {
      int pSum = d1[i - 1] + d2[i + 1];
      if (max < pSum) {
        max = pSum;
      }
    }

    System.out.println(max);
  }
}
