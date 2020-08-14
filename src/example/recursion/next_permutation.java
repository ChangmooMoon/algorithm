package example.recursion;
// C++ algorithm next_permutation 따라함. (오름차순으로 정렬된 리스트)
public class next_permutation {
  // PS에서는 성능 문제 때문에 못 쓸 함수임
  static boolean next_permutation(int[] arr) {
    int i = arr.length -1;
    int j = arr.length -1;

    while(i> 0 && arr[i-1] >= arr[i]) i--;
    if(i<=0) return false;

    while(arr[i-1] > arr[j]) j--;
    arr = swap(arr, i - 1, j);

    j = arr.length -1;
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
    return true;
  }

  static int[] swap(int[] arr, int a, int b) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
    return arr;
  } // 평소에는 Collections.swap()을 쓰자


}
