package acmicpc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BJ_13023 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    String[] s = br.readLine().split(" ");

    int n = Integer.parseInt(s[0]); // 사람의 수
    int m = Integer.parseInt(s[1]); // 친구관계의수
    List<List<Integer>> graph = new ArrayList<List<Integer>>(n);

    for (int i = 0; i < m; i++) {
      String[] rel = br.readLine().split(" ");
      int me = Integer.parseInt(rel[0]);
      int friend = Integer.parseInt(rel[1]);
      System.out.println(me + "-" + friend);
      System.out.println(graph.get(i));
    }

    System.out.println(graph.toString());
  }
}
