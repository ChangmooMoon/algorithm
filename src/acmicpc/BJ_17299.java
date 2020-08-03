package acmicpc;

import java.io.*;
import java.util.*;

public class BJ_17299 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");

    Stack<Integer> stack = new Stack<>();
    int[] A = new int[N];
    int[] F = new int[1000001];
    int[] NGF = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      F[A[i]]++;
    }

    for (int i = 0; i < N; i++) {
      while (!stack.isEmpty() && F[A[stack.peek()]] < F[A[i]]) {
        // A[i]의 빈도가 A[stack.peek()]의 빈도보다 클 때
        NGF[stack.pop()] = A[i];
      }
      stack.push(i);
    }


    while (!stack.isEmpty()) {
      NGF[stack.pop()] = -1;
    }

    for (int i = 0; i < NGF.length; i++) {
      bw.write(NGF[i] + " ");
    }

    bw.flush();
  }
}
