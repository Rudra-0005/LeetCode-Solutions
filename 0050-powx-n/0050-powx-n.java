class Solution {
    public double myPow(double x, int n) {

        long power = n;      // Use long to avoid overflow
        double ans = 1.0;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {

            if ((power & 1) == 1) {   // If power is odd
                ans *= x;
            }

            x *= x;       // Square the base
            power /= 2;   // Divide exponent by 2
        }

        return ans;
    }
}