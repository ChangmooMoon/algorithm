package acmicpc;

//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;
import java.util.Scanner;

public class BJ_14500 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    Scanner sc = new Scanner(new File("src/INPUT.txt"));
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m]; //
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    int max = 0;
    for (int i = 0; i < n; i++) { // i행 0~n-1
      for (int j = 0; j < m; j++) { // j열 0~m-1
        if (j + 3 < m) { // 1
          max = Math.max(max, a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i][j + 3]);
        }
        if (i + 3 < n) { // 2
          max = Math.max(max, a[i][j] + a[i + 1][j] + a[i + 2][j] + a[i + 3][j]);
        }
        if (j + 1 < m && i + 1 < n) {  // 3
          max = Math.max(max, a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i + 1][j + 1]);
        }
        if (j + 1 < m && i + 2 < n) { // 4
          max = Math.max(max, a[i][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 2][j + 1]);
          max = Math.max(max, a[i][j + 1] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 2][j]);
        }
        if (j + 2 < m && i + 2 < n) { // 5
          max = Math.max(max, a[i][j+1] + a[i][j+2] + a[i+1][j] + a[i+1][j+1]);
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+1][j+2]);
        }
        if (j + 1 < m && i + 2 < n) { //6
          max = Math.max(max, a[i][j] + a[i+1][j] + a[i+2][j] + a[i+2][j+1]);
          max = Math.max(max, a[i][j+1] + a[i+1][j+1] + a[i+2][j+1] + a[i+2][j]);
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i+1][j+1] + a[i+2][j+1]);
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i+1][j] + a[i+2][j]);
        }
        if (j + 2 < m && i + 1 < n) { //7
          max = Math.max(max, a[i][j+2] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2]);
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+2]);
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j]);
          max = Math.max(max, a[i][j] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2]);
        }
        if (j + 2 < m && i + 1 < n) { //8
          max = Math.max(max, a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1]);
          max = Math.max(max, a[i][j+1] + a[i+1][j] + a[i+1][j+1] + a[i+1][j+2]);
        }
        if (j + 1 < m && i + 2 < n) { //9
          max = Math.max(max, a[i][j+1] + a[i+1][j] + a[i+1][j+1] + a[i+2][j+1]);
          max = Math.max(max, a[i][j] + a[i+1][j] + a[i+2][j] + a[i+1][j+1]);
        }
      }
    }
    System.out.println(max);
  }
}
