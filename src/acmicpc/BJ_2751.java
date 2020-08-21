package acmicpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BJ_2751 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

//    a = quickSort(a);
    for (int i = 0; i < n; i++) {
      System.out.print(a[i]);
    }
    System.out.println();
    mergeSort(a, 0, n-1);
//    a = heapSort(a);
    for (int i = 0; i < n; i++) {
      System.out.print(a[i]);
    }
  }

  static int[] quickSort(int[] arr) {
    return arr;
  }

  static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  static void merge(int[] arr, int start, int mid, int end) {
    int i = start; // 왼쪽 부분집합 시작인덱스
    int j = mid + 1; // 오른쪽 부분집합 시작인덱스
    int k = start; // 정렬된 원소 저장 시작인덱스
    int[] tmp = new int[arr.length];

    while (i <= mid && j <= end) {
      if (arr[i] <= arr[j]) {
        tmp[k++] = arr[i++];
      } else {
        tmp[k++] = arr[j++];
      }

      while (i <= mid) {
        tmp[k++] = arr[i++];
      }

      while (j <= end) {
        tmp[k++] = arr[j++];
      }

      for (int idx = start; idx <= end; idx++) {
        arr[idx] = tmp[idx];
      }
    }
  }

  static int[] heapSort(int[] arr) {
    return arr;
  }
}
