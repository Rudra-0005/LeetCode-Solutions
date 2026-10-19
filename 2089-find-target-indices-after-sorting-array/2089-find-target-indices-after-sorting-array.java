class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lt = 0, eq = 0;

        for (int x : nums) {
            if (x < target) {
                lt++;
            }
            if (x == target) {
                eq++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = lt; i < lt + eq; i++) {
            ans.add(i);
        }

        return ans;
    }
}