package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int min;
    int max;

    String[] input = br.readLine().split(" ");
    min = Integer.parseInt(input[0]);
    max = Integer.parseInt(input[0]);
    for (int i = 1; i < n; i++) {
      int target = Integer.parseInt(input[i]);
      if (min > target) {
        min = target;
      }
      if (target > max) {
        max = target;
      }
    }
    System.out.println(min + " " + max);
  }
}
