package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2751 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

//    mergeSort(a);
//    quickSort(a, 0, n - 1);
    heapSort(a);
    for (int i = 0; i < n; i++) {
      sb.append(a[i] + " ");
    }
    System.out.println(sb);
  }

//  static void quickSort(int[] arr, int start, int end) {
//    int part2 = partition(arr, start, end);
//    if (start < part2 - 1) { // 왼쪽 파티션
//      quickSort(arr, start, part2 - 1);
//    }
//    if (part2 < end) { // 오른쪽 파티션
//      quickSort(arr, part2, end);
//    }
//  }

//  static int partition(int[] arr, int start, int end) {
//    int mid = (start + end) / 2;
//    int pivot = arr[mid];
//    while (start <= end) {
//      while(arr[start] < pivot) start++; // 왼쪽에서 피봇보다 큰 값 찾기
//      while(arr[end] > pivot) end--; // 오른쪽에서 피봇보다 작은 값 찾기
//      if (start <= end) {
//        swap(arr, start, end);
//        start++;
//        end--;
//      }
//    }
//    return start;
//  }
//
  static void swap(int[] arr, int start, int end) {
    int tmp = arr[start];
    arr[start] = arr[end];
    arr[end] = tmp;
  }

//  static void mergeSort(int[] arr) {
//    int[] tmp = new int[arr.length];
//    mergeSort(arr, tmp, 0, arr.length - 1);
//  }
//  static void mergeSort(int[] arr, int[] tmp, int start, int end) {
//    if (start < end) {
//      int mid = (start + end) / 2;
//      mergeSort(arr, tmp, start, mid);
//      mergeSort(arr, tmp, mid + 1, end);
//      merge(arr, tmp, start, mid, end);
//    }
//  }
//
//  static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
//    for (int i = start; i <= end; i++) {
//      tmp[i] = arr[i];
//    }
//    int part1 = start;
//    int part2 = mid+1;
//    int index = start; //tmp배열 복사 시작 인덱
//
//    while (part1 <= mid && part2 <= end) {
//      if (tmp[part1] <= tmp[part2]) {
//        arr[index++] = tmp[part1++];
//      } else {
//        arr[index++] = tmp[part2++];
//      }
//    }
//
//    for (int i = 0; i <= mid - part1; i++) {
//      arr[index + i] = tmp[part1 + i];
//    }
//  }


  static void heapSort(int[] arr) {
    int n = arr.length;
    maxHeapify(arr, n);
    for (int i = arr.length - 1; i > 0; i--) {
      swap(arr, 0, i);
      maxHeapify(arr, i);
    }
  }

  static void maxHeapify(int[] a, int idx) {
    for (int i = 1; i < idx; i++) {
      int child = i;
      while (child > 0) {
        int parent = (child - 1) / 2;
        if (a[child] > a[parent]) {
          swap(a, child, parent);
        }
        child = parent;
      }
    }
  }

}
