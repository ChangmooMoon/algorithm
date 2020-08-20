package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken()); // 카드 장수
    int M = Integer.parseInt(st.nextToken()); // 카드숫자 합
    int[] a = new int[N];
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0;
    for (int i = 0; i < N-2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = a[i] + a[j] + a[k];
          if (sum <= M) {
            max = Math.max(max, sum);
          }
        }
      }
    }
    System.out.println(max);
  }
}
