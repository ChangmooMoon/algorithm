package acmicpc;

import java.io.*;
import java.util.Stack;

public class BJ_17413 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String S = br.readLine();
    boolean tag = false;
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if (ch == '<') {
        tag = true;
        while (!stack.isEmpty()) {
          bw.write(stack.pop());
        }
        bw.write(ch);
      } else if (ch == '>') {
        tag = false;
        bw.write(ch);
      } else if (tag) {
        bw.write(ch);
      } else {
        if (ch == ' ') {
          while (!stack.isEmpty()) {
            bw.write(stack.pop());
          }
          bw.write(ch);
        } else {
          stack.push(ch);
        }
      }
    }

    while (!stack.isEmpty()) {
      bw.write(stack.pop());
    }

    bw.flush();
    bw.close();
  }
}
