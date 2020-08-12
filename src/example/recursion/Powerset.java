// https://www.youtube.com/watch?v=nkeMRRIVW9s&list=PL52K_8WQO5oUuH06MLOrah4h05TZ4n38l&index=7
// 임의의 집합 data의 모든 부분집합 출력
package example.recursion;

public class Powerset {
  private static char[] data = {'a', 'b', 'c'};
  private static int n = data.length;
  private static boolean[] includes = new boolean[n]; // true면 사용되는숫자

  public static void main(String[] args) {
    powerset(0);
  }

  static void powerset(int k) { // k, include: 트리 상에서 현재 나의 위치
    // base case
    if (k == n) { // 만약 내 위치가 leaf node라면
      for (int i = 0; i < k; i++) {
        if (includes[i]) System.out.print(data[i] + " ");
      }
      System.out.println();
      return;
    }
    // recursion case
    // data[k] ~ data[n-1]의 멱집합을 구한 후 각각에 include[i] = true
    // i =0, ... k-1 인 원소를 추가하여 출력하라
    includes[k] = false;
    powerset(k + 1); // 먼저 왼쪽으로 내려갔다가
    includes[k] = true;
    powerset(k + 1); // 오른쪽으로 내려간다.

  }
}
// 처음 이 함수를 호출할 때는 Powerset(0)을 호출한다. p는 공집합, s는 전체집합

