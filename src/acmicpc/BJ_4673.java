package acmicpc;

public class BJ_4673 {
  public static void main(String[] args) {
    boolean [] d = new boolean[10001];
    for (int i = 1; i<= 10000; i++) {
      int num = selfNum(i);
      if (num <= 10000) {
        d[num] = true;
      }
    }
    for (int i = 1; i <= 10000; i++) {
      if (!d[i]) {
        System.out.println(i);
      }
    }
  }

  static int selfNum(int n) {
    String s = String.valueOf(n);
    int sum = n;
    for (int i = 0; i < s.length(); i++) {
      sum += Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    return sum;
  }
}
