package acmicpc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_9093 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Character> stack = new Stack<>();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String str = br.readLine() + " "; // 개행문자 대신에 여백문자로 경계 처리
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == ' ') { // 단어 단위
          while (!stack.isEmpty()) { // 글자 스택이 빌 때까지
            System.out.print(stack.pop());
          }
          System.out.print(" ");

        } else { // 단어가 끊나지 않았으면
          stack.add(str.charAt(j));
        }
      }
      System.out.println();
    }
  }
}
