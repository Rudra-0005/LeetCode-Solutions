class Solution {

    public boolean canEatAtTime(int[] piles, int h, int mid) {
        int hours = 0;

        for (int pile : piles) {
            hours += (pile + mid - 1) / mid;

            if (hours > h) return false;
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int min = 1;

        while (min < max) {
            int mid = min + (max - min) / 2;

            if (canEatAtTime(piles, h, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}