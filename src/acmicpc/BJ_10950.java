package acmicpc;

import java.io.*;

public class BJ_10950 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String[] word = br.readLine().split(" ");
      bw.write(Integer.parseInt(word[0]) + Integer.parseInt(word[1]) + "\n");
    }

    br.close();
    bw.flush();
    br.close();
  }
}
