import java.lang.Math;

public class countAllSetBits {
  // count set bits from 1 to n
  public static int countSetBits (int n) {
    if (n < 2) return n;
    int msb = (int)(Math.log(n) / (Math.log(2));
    return (msb * (1 << (msb - 1)) + (n - (1 << msb)) + 1 + countSetBits(n - (1 << msb));
  }
}
