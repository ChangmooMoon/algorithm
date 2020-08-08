//package acmicpc;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_14002 {
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringBuilder sb = new StringBuilder();
//    StringTokenizer st;
//
//    int n = Integer.parseInt(br.readLine());
//    st = new StringTokenizer(br.readLine(), " ");
//    int a[] = new int[n];
//    int L[] = new int[n]; // LIS length
//    int pIndex[] = new int[n]; // pastIdx
//
//    for (int i = 0; i < n; i++) {
//      a[i] = Integer.parseInt(st.nextToken());
//      L[i] = 1; // default LIS길이는 1
//      pIndex[i] = -1;
//      static void movToPastIdx(int n) {
//        if(n == -1) return;
//        else {
//        }
//        return
//      }
//      for (int j = 0; j < i; j++) {
//        if (a[j] < a[i] && L[i] < L[j] + 1) {
//          L[i] = L[j] + 1; // L[i] = Max(L[j] + 1
//          pIndex[i] = j;
//        }
//      }
//    }
//
//   }
//}
