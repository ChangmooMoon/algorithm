package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_17087 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input1 = br.readLine().split(" ");
    int n = Integer.parseInt(input1[0]);
    int s = Integer.parseInt(input1[1]);
    int[] a = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      a[i] = Math.abs(Integer.parseInt(st.nextToken()) - s);
    }

    int gcdResult = a[0];
    for (int i = 1; i < n; i++) {
      gcdResult = GCD(gcdResult, a[i]);
    }
    System.out.println(gcdResult);
  }

  static int GCD(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}
