package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ_10845 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int[] queue = new int[n];
    int begin = 0;
    int end = 0;

    while(n-- != 0) {
      st = new StringTokenizer(br.readLine(), " ");
      String item = st.nextToken();
      if (item.equals("push")) {
        queue[end] = Integer.parseInt(st.nextToken());
        end++;
      } else if (item.equals("pop")) {
        if (begin != end) {
          bw.write(queue[begin++] + "\n");
        } else {
          bw.write("-1" + "\n");
        }
      } else if (item.equals("size")) {
        bw.write(end - begin + "\n");
      } else if (item.equals("empty")) {
        if (begin != end) {
          bw.write('0' + "\n");
        } else {
          bw.write("1" + "\n");
        }
      } else if (item.equals("front")) {
        if (begin != end) {
          bw.write(queue[begin] + "\n");
        } else {
          bw.write("-1" + "\n");
        }
      } else if (item.equals("back")) {
        if (begin != end) {
          bw.write(queue[end-1] + "\n");
        } else {
          bw.write("-1" + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}

