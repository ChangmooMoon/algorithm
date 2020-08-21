package acmicpc;

import java.io.IOException;
import java.util.Scanner;

public class BJ_2750 {
  static int[] a;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = sc.nextInt();
    a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    a = selectionSort(a);
    a = bubbleSort(a);
    a = insertionSort(a);
    for (int i = 0; i < n; i++) {
      sb.append(a[i] + "\n");
    }
    System.out.println(sb);
  }

  static int[] selectionSort(int[] arr) { // 제일 큰 값을 찾아서 마지막 인덱스랑 교환한다. 그리고 그 놈은 안 건듬
    int n = arr.length;
//    for (int i = 0; i < n - 1; i++) {
//      int min_idx = i;
//      for (int j = i + 1; j < n; j++) {
//        if(arr[j] < arr[min_idx])
//          min_idx = j;
//      }
//      int tmp = arr[min_idx];
//      arr[min_idx] = arr[i];
//      arr[i] = tmp;
//    }
    for (int i = n-1; i >= 0; i--) {
      int max_idx = i;
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] > arr[max_idx]) {
          max_idx = j;
        }
      }
      int tmp = arr[max_idx];
      arr[max_idx] = arr[i];
      arr[i] = tmp;
    }

    return arr;
  }

  static int[] bubbleSort(int[] arr) { // 최대값을 찾아서 맨 마지막 인덱스로 한칸씩 가져온다. 그물로 고기를 가져온다
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j+1] = tmp;
        }
      }
    }
    return arr;
  }

  static int[] insertionSort(int[] arr) { // k-1개의 요소가 정렬된 상태에서 K번째 요소를 끼워넣어 정렬한다
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int element = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > element) { // 정렬된 곳에 끼워 넣
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = element;
    }
    return arr;
  }
}

