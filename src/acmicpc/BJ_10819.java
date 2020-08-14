package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_10819 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    List<Integer> list = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      list.add(a);
    }
    Collections.sort(list);
    int result = Integer.MIN_VALUE;
    do {
      int tmp = calculate(list);
      result = Math.max(result, tmp);
    } while (next_permutation(list));

    System.out.println(result);
  }

  static int calculate(List<Integer> list) {
    int sum = 0;
    for (int i = 1; i < list.size(); i++) {
      sum += Math.abs(list.get(i-1) - list.get(i));
    }
    return sum;
  }

  static boolean next_permutation(List<Integer> list) {
    int i = list.size() - 1;
    int j = list.size() - 1;

    while(i > 0 && list.get(i-1) >= list.get(i)) i--;
    if(i<=0) return false;

    while(list.get(i-1) > list.get(j)) j--;
    Collections.swap(list, i - 1, j);

    j = list.size() -1;
    while (i < j) {
      Collections.swap(list, i, j);
      i++;
      j--;
    }
    return true;
  }
}
