class Solution {
    public int minimumDistance(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }

            ArrayList<Integer> list = map.get(num);
            list.add(i);

            if (list.size() >= 3) {
                int n = list.size();

                int first = list.get(n - 3);
                int third = list.get(n - 1);

                int distance = 2 * (third - first);

                ans = Math.min(ans, distance);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}