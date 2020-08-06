package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_16194 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] price_combo = new int[n + 1];
    int[] pack_price = new int[n + 1];

    Arrays.fill(price_combo, -1); // -1 가격은 존재하지 않음
    price_combo[0] = 0;

    for (int i = 1; i <= n; i++) {
      pack_price[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (price_combo[i] == -1 || price_combo[i] > price_combo[i - j] + pack_price[j]) {
          price_combo[i] = price_combo[i - j] + pack_price[j];
        }
      }
    }

    System.out.println(price_combo[n]);
  }
}
