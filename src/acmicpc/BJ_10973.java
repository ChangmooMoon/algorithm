package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BJ_10973 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    ArrayList<Integer> list = new ArrayList<>(n);
    for (int i : a) {
      list.add(i);
    }
    prev_permutation(list, n); // {5,4,3,2,1}, 5
  }

  static void prev_permutation(ArrayList<Integer> list, int n) {
    int i = n - 1; // 맨 인덱스
    while (i > 0 && list.get(i - 1) <= list.get(i)) {
      i--;
    }
//    System.out.println(i); // 6
    int j = n - 1; // 5-1 = 4
    while (list.get(j) >= list.get(i - 1)) { // list.get(4) <= list.get(2)
      j--;
    }
//    System.out.println(j); // 6

    Collections.swap(list, i - 1, j);
    while (i < j) {
      Collections.swap(list, i - 1, j);
      i++;
      j--;
    }
    System.out.println(list);
  }
}
