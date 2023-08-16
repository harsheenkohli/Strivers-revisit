public class ReverseBits {
	public static void swap(int i, int j, int arr[]) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}

	public static long reverseBits(long n) {
		int[] bits = new int[32];

		// Preparing the bits array.
		for (int i = 0; i < 32; i++) {

			// If the ith bit is set.
			if ((n & (long) 1 << i) > 0) {
				bits[i] = 1;
			}
		}
		for (int i = 0; i < 16; i++) {

			// Swapping the left and rightmost bits.
			swap(i, 31 - i, bits);
		}

		// 'ans' will store the value for the reversed bits representation.
		long ans = 0;

		for (int i = 0; i < 32; i++) {

			// If the i'th bit is set.
			if (bits[i] == 1) {
				ans += (long) 1 << i;
			}
		}
		return ans;

	}

}
