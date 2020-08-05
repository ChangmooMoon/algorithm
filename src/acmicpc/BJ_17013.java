package acmicpc;

import java.io.*;
import java.util.ArrayList;

public class BJ_17013 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());
    ArrayList<Integer> prime = new ArrayList<Integer>();
    boolean check[] = new boolean[1_000_001]; // 소수체크 배열
    check[0] = check[1] = true; // false이면 소수

    for (int i = 2; i < check.length; i++) {
      if (check[i] == false) {
        prime.add(i);
        for (int j = i * 2; j < check.length; j += i) {
          check[j] = true;
        }
      }
    }

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      for (Integer num : prime) {
        if (n /2 >= num && check[n - num] == false) {
          count++;
        }
      }
      bw.write(count + "\n");
    }
    bw.flush();
  }
}
