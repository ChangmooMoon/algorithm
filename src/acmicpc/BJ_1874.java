package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1874 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder(100000);

    Stack<Integer> stack = new Stack<>();
    int element = 0; // 스택에 추가될 수
    int n = Integer.parseInt(br.readLine());

    while (n > 0) {
      n--;
      int target = Integer.parseInt(br.readLine());
      if (target > element) {
        while (target > element) {
          stack.push(++element);
          sb.append('+').append('\n');
        }
        stack.pop();
        sb.append('-').append('\n');
      } else {
        boolean found = false;
        if (!stack.isEmpty()) {
          int top = stack.peek();
          stack.pop();
          sb.append('-').append('\n');

          if (target == top) {
            found = true;
          }
        }

        if (!found) {
          System.out.println("NO");
          System.exit(0);
        }
      }
    }

    System.out.println(sb);
  }
}

// 8개 - 4 3 6 8 7 5 2 1 가능
// 5개 - 1 2 5 3 4 불가