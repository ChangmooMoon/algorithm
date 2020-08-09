package acmicpc;

import java.util.Scanner;

public class BJ_1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    float[] d = new float[n];
    float max = -1;
    for (int i = 0; i < n; i++) {
      d[i] = sc.nextFloat();
      if (max < d[i]) {
        max = d[i];
      }
    }

    float sum = 0;
    for (int i = 0; i < n; i++) {
      sum += d[i] / max * 100;
    }

    System.out.println(sum/n);
  }
}