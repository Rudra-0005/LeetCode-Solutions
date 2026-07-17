class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int Tsum=0;

        for(int i = 0; i<n; i++){
            
            Tsum+=nums[i];
        }

        int Lsum=0;
        int ans[]=new int [n];

        for(int i=0;i<n;i++){
            int Rsum=Tsum-Lsum-nums[i];
            ans[i]=Math.abs(Lsum-Rsum);
            Lsum+=nums[i];
        }
        return ans;
        
    }
}