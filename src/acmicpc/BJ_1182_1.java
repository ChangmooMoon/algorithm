package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1182_1 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken()); // 정수 n개 // 5
    int s = Integer.parseInt(st.nextToken()); // 부분집합의 합이 s // 0
    int[] a = new int[n]; // 전체집합
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }
    System.out.println(count_subset(n, s, a));
  }

  static int count_subset(int n, int s, int[] a) {
    int count = 0;
    for (int i = 1; i < (1 << n); i++) { // 1~2^n 범위의 모든 부분집합 조회
      int sum = 0;
      for (int k = 0; k < n; k++) { // k가 들어있는 부분집합 조회
        if ((i & (1 << k)) > 0) {
          sum += a[k];
        }
      }
      if (sum == s) {
        count++;
      }
    }
    return count;
  }
}
