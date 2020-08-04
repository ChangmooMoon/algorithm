package acmicpc;

import java.io.*;
import java.util.ArrayList;

// 골드바흐의 추측
public class BJ_6588 {
  public static final int size = 1_000_000;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean[] check = new boolean[size+1]; // 0~size범위, 체에서 걸려졌으면 true, 소수이면 false
    ArrayList<Integer> pn_list = new ArrayList<Integer>(); // 소수 저장

    check[0] = true;
    check[1] = true;

    for (int i = 2; i * i <= size; i++) { // 2의 배수부터 시작. O(root N) 복잡도로 조회범위 줄임
      if (check[i] == true) {
        continue;
      }
      pn_list.add(i);
      for (int j = i * 2; j <= size; j += i) { // int j= i*i이면 오버플로우 발생
        check[j] = true;
      }
    }

    // 2. 골드바흐 추측 검증
    // 2의 배수 n은 2가 아닌 소수 a+b와 같다 =>  n = a+b, a = n-b
    // check[n-b] == false 이면 a도 소수지.
    while(true) {
      int n = Integer.parseInt(br.readLine());
      if(n ==0) break;

      for (int i = 1; i < pn_list.size(); i++) {
        int b = pn_list.get(i);
        if (check[n - b] == false) { // 14- 3 = 11 = a
          bw.write(n + " = " + b + " + " + (n - b) + "\n");
          break;
        }
      }
    }

    bw.flush();
  }
}
