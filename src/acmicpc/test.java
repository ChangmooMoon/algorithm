package acmicpc;

public class test {
  private static void merge(int[] a, int left, int mid, int right) {

    int lidx = left;
    int ridx = mid+1;
    int[] b = new int[a.length];
    int bidx = left;

    while(lidx <= mid && ridx <= right) {

      if(a[lidx] <= a[ridx]){
        b[bidx] = a[lidx];
        lidx += 1; bidx +=1;
      }
      else {
        b[bidx] = a[ridx];
        ridx += 1; bidx +=1;
      }
    }

    if(lidx > mid) {
      for(int i = ridx; i<= right; ++i,++bidx)
        b[bidx] = a[i];
    }
    else {
      for(int i = lidx; i<= mid; ++i, ++bidx)
        b[bidx] = a[i];
    }
    for(int i=left; i<=right; ++i)
      a[i] = b[i];
  }
}
