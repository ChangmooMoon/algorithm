package acmicpc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_16940 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    int n = sc.nextInt() - 1;
    sc.nextLine();
    ArrayList<Integer>[] a = new ArrayList[n+1];
    for (int i = 1; i <= n; i++) {
      a[i] = new ArrayList<>();
    }
    

    System.out.println(Arrays.deepToString(a));


  }
}
