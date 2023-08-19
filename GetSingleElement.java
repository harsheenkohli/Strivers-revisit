public class GetSingleElement {

  public static int getSingleElement(int arr[]) {
    int n = arr.length, low = 0, high = n - 2;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (check (mid, arr)) {
        low = mid + 1;
      }
      else {
        high = mid - 1;
      }
    }
    return arr[low];
  }

  public static boolean check(int pos, int arr[]) {
    return (arr[pos] == arr[pos + 1]) == (pos % 2 == 0);
  }
  // T.C. => O(log n)
}
