//package acmicpc;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_1248 {
//  static int n; // n개의 정수
//  static char[][] sign; // S(i,j)의 부호, S(i,j) == A[i]~A[j]의
//  static int[] ans;
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
//
//    n = Integer.parseInt(br.readLine()); // N개의 정수
//    String str = br.readLine();
//    sign = new char[n][n]; // S배
//    int count = 0;
//    for (int i = 0; i < n; i++) {
//      for (int j = i; j < n; j++) {
//        sign[i][j] = str.charAt(count);
//        count++;
//      }
//    }
//
//    make_seq(0);
//  }
//
//  static boolean make_seq(int now_n) {
//  }
//
//}
