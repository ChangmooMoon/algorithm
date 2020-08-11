package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3085 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    char d[][] = new char[n][n];

    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      for (int j = 0; j < n; j++) {
        d[i][j] = s.charAt(j);
      }
    }

//    System.out.println(Arrays.deepToString(d));

    int max_candy = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if (j + 1 < n) {
          d[i][j + 1] = swap(d[i][j], d[i][j] = d[i][j + 1]); // 오른쪽 교환
          int candy = check_candy(d);
          if (max_candy < candy) max_candy = candy;
          if (max_candy == n) break;
          d[i][j + 1] = swap(d[i][j], d[i][j] = d[i][j + 1]);
        }

        if (i + 1 < n) {
          d[i + 1][j] = swap(d[i][j], d[i][j] = d[i + 1][j]); // 아래쪽 교환
          int candy = check_candy(d);
          if (max_candy < candy) max_candy= candy;
          if (max_candy == n) break;
          d[i + 1][j] = swap(d[i][j], d[i][j] = d[i + 1][j]);
        }
      }
    }
    System.out.println(max_candy);
  }

  static char swap(char a, char b) {
//    Object tmp = a;
//    a = b;
//    b = tmp;
    return a;
  }

  static int check_candy(char[][] a) {
    int max_candy = 1;
    for (int i = 0; i < a.length; i++) {
      int count = 1;
      for (int j = 1; j < a.length ; j++) { // 행검사
        if (a[i][j] == a[i][j - 1]) count++;
        else count = 1;
        if (max_candy < count) max_candy = count;
      }
      count = 1;
      for (int j = 1; j < a.length; j++) { // 열검사
        if (a[j][i] == a[j - 1][i]) count++;
        else count = 1;
        if(max_candy < count) max_candy = count;
      }
    }
    return max_candy;
  }
}
