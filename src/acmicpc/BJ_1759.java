package acmicpc;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1759 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader("src/INPUT.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] lc = br.readLine().split(" ");
    int l = Integer.parseInt(lc[0]); // 암호 길이
    int c = Integer.parseInt(lc[1]); // 문자 종류갯수

    String[] s = br.readLine().split(" ");
    Arrays.sort(s);
    print_password(l, s, "", 0);
  }

  static void print_password(int l, String[] s, String now_pw, int now_i) {
    if (now_pw.length() == l) { // now_pw가 l길이가 됬을때 모음 검사
      if (is_proper_string(now_pw)) {
        System.out.println(now_pw);
      }
      return;
    }

    if (now_i >= s.length) { // 더 이상 s에서 고를 알파벳이 없을 경우
      return;
    }
    // now_i 인덱스 사용하는 경우, 안사용하는 경우
    print_password(l, s, now_pw.concat(s[now_i]), now_i + 1);
    print_password(l, s, now_pw, now_i + 1);
  }

  static boolean is_proper_string(String s) {
    boolean check_vowel = false;
    int check_consonant = 0;
    for (int i = 0; i < s.length(); i++) {
      char target = s.charAt(i);
      if (target == 'a' || target == 'e' || target == 'o' || target == 'u' || target == 'i') {
        check_vowel = true;
      } else {
        check_consonant++;
      }
    }
    return check_vowel && check_consonant >= 2;
  }
}
