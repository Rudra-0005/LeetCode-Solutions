class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        
        int min = Integer.MAX_VALUE;
        
        // Locate Karo Min elemennt
        for(int i = 0 ;i<n ; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        
        // Min element ko saare elements se minus karo isse hume array mil jaeya jimse har element ko min ke barbar karne ke moves honge

        for(int i = 0 ; i<n ; i++){
            nums[i]= nums [i] -min;
        }

        int ans = 0;
        // sum karege arr ke har element ka toh mil jeaga min moves
        for(int val : nums){
            ans = ans + val;
        }

        return ans;
    }
}