package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// next_permutation (다음 순열 구하는 문제)
public class BJ_10972 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    List<Integer> list = new ArrayList<>(n+1);
    for (int i : a) {
      list.add(i);
    }

    next_permutation(list, n); // a = [1,2,3,4], n = 4
    // a = [5,4,3,2,1] n = 5
  }

  static void next_permutation(List<Integer> list, int n) {
    int i = n - 1;
    while (i > 0 && list.get(i - 1) >= list.get(i)) i--;
    if (i <= 0) {
      System.out.println("-1");
      return;
    } // 다음 수열이 없는 마지막 수열임
    int j = n - 1;
    while (list.get(j) <= list.get(i - 1)) {
      j--;
    }
    Collections.swap(list, i - 1, j);
    j = n - 1;
    while (i < j) {
      Collections.swap(list, i, j);
      i++;
      j--;
    }
    for (int k = 0; k < list.size(); k++) {
      sb.append(list.get(k));
      if (k != list.size() - 1) {
        sb.append(" ");
      }
    }
    System.out.println(sb);
    return;
  }
}
