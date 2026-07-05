class Solution {
    public int reverseBits(int n) {
      int reverse = 0;

        for (int i = 0; i < 32; i++) {
            reverse <<= 1;          // Make space for next bit
            reverse |= (n & 1);     // Copy last bit of n
            n >>= 1;               // Unsigned right shift
        }

        return reverse;

    }
}