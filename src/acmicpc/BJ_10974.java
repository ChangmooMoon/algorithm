package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10974 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()); // 1~8

    permutation(n);
    System.out.println(sb);
  }

  static void permutation(int n) {
    int[] arr = new int[n]; // [0,1,2,3,4]
    for (int i = 0; i < n; i++) {
      arr[i] = i+1;
    }

    do {
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    } while (next_permutation(arr));
  }

  static boolean next_permutation(int[] arr) {
    int i = arr.length -1;
    int j = arr.length -1;

    while(i> 0 && arr[i-1] >= arr[i]) i--;
    if(i<=0) return false;

    while(arr[i-1] > arr[j]) j--;
    arr = swap(arr, i - 1, j);

    j = arr.length -1;
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
    return true;
  }

  static int[] swap(int[] arr, int a, int b) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
    return arr;
  }
}
