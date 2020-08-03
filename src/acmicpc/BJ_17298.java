package acmicpc;

import java.io.*;
import java.util.*;

public class BJ_17298 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    int[] NGE = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < N; i++) {
      while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
        NGE[stack.pop()] = A[i];
      }

      stack.push(i);
    }

    while (!stack.isEmpty()) {
      NGE[stack.pop()] = -1;
    }

    for (int i = 0; i < NGE.length; i++) {
      bw.write(NGE[i] + " ");
    }

    bw.flush();
  }
}
