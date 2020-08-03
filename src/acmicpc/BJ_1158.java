package acmicpc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1158 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder("<");
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= N; i++) {
      list.add(i);
    }

    int targetIdx = 0;
    while (!list.isEmpty()) {
      targetIdx = (targetIdx + K - 1)%N;
      sb.append(list.get(targetIdx));
      list.remove(targetIdx);
      N--;

      if (!list.isEmpty()) {
        sb.append(", ");
      }
    }

    sb.append('>');
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
