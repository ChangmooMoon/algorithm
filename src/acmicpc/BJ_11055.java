package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11055 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");

    int[] a = new int[n+1];
    int[] d = new int[n+1];
    for (int i = 1; i <= n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

//    System.out.println(Arrays.toString(a));

    for (int i = 1; i <= n; i++) {
      d[i] = a[i];
      for (int j = 0; j < i; j++) {
        if (a[j] < a[i] && d[i] < d[j] + a[i]) {
          d[i] = d[j] + a[i];
        }
      }
    }

//    System.out.println(Arrays.toString(d));

    int max = -1;
    for (int i = 0; i <= n; i++) {
      max = Math.max(max, d[i]);
    }

    System.out.println(max);
  }
}
