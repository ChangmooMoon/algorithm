package acmicpc;

import java.io.*;

public class BJ_2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    sb.append(br.readLine()).reverse();
    String[] a = sb.toString().split(" ");
    System.out.println(Math.max(Integer.parseInt(a[0]),Integer.parseInt(a[1])));
  }
}
