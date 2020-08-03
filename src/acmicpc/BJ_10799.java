package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10799 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Stack<Integer> stack = new Stack<>();
    String S = br.readLine();

    int cuttedBar = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '(') { // 막대기 시작
        stack.push(i);
      } else {
        if (stack.peek() + 1 == i) { // 레이저컷
          stack.pop();
          cuttedBar += stack.size();
        } else { // 쇠막대기 한줄 추가
          stack.pop();

        }
      }
    }
    System.out.println(cuttedBar);
  }
}
