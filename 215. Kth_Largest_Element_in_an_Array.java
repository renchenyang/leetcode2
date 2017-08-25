public class Solution {

  public int findKthLargest(int[] a, int k) {
    int n = a.length;
    int p = quickSelect(a, 0, n - 1, n - k + 1);
    return a[p];
  }

  int quickSelect(int[] a, int lo, int hi, int k) {
    int i = lo, j = hi, pivot = a[hi];
    while (i < j) {
      if (a[i++] > pivot)
        swap(a, --i, --j);
    }
    swap(a, i, hi);

    int m = i - lo + 1;
    if (m == k)
      return i;
    else if (m > k)
      return quickSelect(a, lo, i - 1, k);
    else
      return quickSelect(a, i + 1, hi, k - m);
  }

  void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

}