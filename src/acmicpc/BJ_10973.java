package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10973 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int[] result = prev_permutation(a, n);
    if (result.length == 0) {
      System.out.println("-1");
      return;
    }
    for (int i = 0; i < n; i++) {
      sb.append(a[i]);
      if (i < n - 1) {
        sb.append(" ");
      }
    }
    System.out.println(sb);
  }
  static int[] prev_permutation(int[] arr, int n) { // arr = {3,1,2}, n = 3
    int i = n - 1; // 2
    while (i > 0 && arr[i-1] <= arr[i]) { // 2>0이고 arr[1] < arr[2] 이면 i = 1 // 1>0이고 arr[0] 3 < arr[1] 1 false
      i--;
    }
    if (i == 0) return new int[]{};

    int j = n - 1; // 4
    while (arr[j] >= arr[i - 1]) { // arr[3]
      j--;
    }

    int tmp = arr[i - 1];
    arr[i-1] = arr[j];
    arr[j] = tmp;

    j = n - 1;
    while (i < j) {
      tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      i++;
      j--;
    }

    return arr;
  }
}
