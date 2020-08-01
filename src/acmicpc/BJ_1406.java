package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1406 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String s = br.readLine();
    int cmdNum = Integer.parseInt(br.readLine());

    Stack<Character> lStack = new Stack<>();
    Stack<Character> rStack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      lStack.push(s.charAt(i));
    } // 왼쪽 스택에 다 박아

    while (cmdNum-- != 0) {
      String[] cmd = br.readLine().split(" "); // 명령어 읽어옴
      char movedChar;

      if (cmd[0].equals("L")) {
        if (!lStack.empty()) {
          movedChar = lStack.pop();
          rStack.push(movedChar);
        }
      } else if (cmd[0].equals("D")) {
        if (!rStack.empty()) {
          movedChar = rStack.pop();
          lStack.push(movedChar);
        }
      } else if (cmd[0].equals("B")) {
        if (!lStack.empty()) {
          lStack.pop();
        }
      } else if (cmd[0].equals("P")) {
        lStack.push(cmd[1].charAt(0));
      }
    }

    while (!lStack.empty()) {
      rStack.push(lStack.pop());
    }

    while (!rStack.empty()) {
      sb.append(rStack.pop());
    }

    System.out.println(sb);
  }
}
