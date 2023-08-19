public class MissingNumber{
  
  public static int summationApproach (int arr[]) {
    int size = arr.length;
    int sum = (size) * (size + 1) / 2;
    int arrSum = 0;
    for (int i = 0; i < size; i++) {
      arrSum += arr[i];
    }
    return (sum - arrSum);
  }

  public static int xorApproach(int arr[]) {
    int xor1 = arr.length, xor2 = 0;
    for (int i = 0; i < arr.length; i++) {
      xor1 = xor1 ^ i;
      xor2 = xor2 ^ arr[i];
    }
    return (xor1 ^ xor2);
  }
  // a ^ a = 0
  // 0 ^ a = a
}
