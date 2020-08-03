package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_10866 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String cmd = st.nextToken();

      if (cmd.equals("push_front")) {
        int num = Integer.parseInt(st.nextToken());
        list.add(0, num);
      } else if (cmd.equals("push_back")) {
        int num = Integer.parseInt(st.nextToken());
        list.add(num);
      } else if (cmd.equals("pop_front")) {
        if (!list.isEmpty()) {
          bw.write(list.remove(0) + "\n");
        } else {
          bw.write("-1" + "\n");
        }
      } else if (cmd.equals("pop_back")) {
        if (!list.isEmpty()) {
          bw.write(list.remove(list.size() - 1) + "\n");
        } else {
          bw.write("-1" + "\n");
        }
      } else if (cmd.equals("size")) {
        bw.write(list.size() + "\n");
      } else if (cmd.equals("empty")) {
        if (list.isEmpty()) {
          bw.write("1" + "\n");
        } else {
          bw.write("0" + "\n");
        }
      } else if (cmd.equals("front")) {
        if (list.isEmpty()) {
          bw.write("-1" + "\n");
        } else {
          bw.write(list.get(0) + "\n");
        }
      } else if (cmd.equals("back")) {
        if (list.isEmpty()) {
          bw.write("-1" + "\n");
        } else {
          bw.write(list.get(list.size() - 1) + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}
