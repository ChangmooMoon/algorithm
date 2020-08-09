package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11054 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");

    int[] a = new int[n];
    int[] d1 = new int[n];
    int[] d2 = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

//    System.out.println(Arrays.toString(a));

    for (int i = 0; i < n; i++) {
      d1[i] = 1; // d1[i] default값
      for (int j = 0; j < i; j++) {
        if (a[i] > a[j] && d1[i] < d1[j] + 1) {
          d1[i] = d1[j] + 1;
        }
      }
    }

    for (int i = n-1; i>= 0; i--) {
      d2[i] = 1;
      for (int j = i+1; j < n; j++) {
        if (a[i] > a[j] && d2[i] < d2[j] + 1) {
          d2[i] = d2[j] + 1;
        }
      }
    }
//    System.out.println(Arrays.toString(d1));
//    System.out.println(Arrays.toString(d2));

    int max = -1;
    for (int i = 0; i < n; i++) {
      max = Math.max(d1[i] + d2[i], max);
    }

    System.out.println(max - 1);
  }
}
