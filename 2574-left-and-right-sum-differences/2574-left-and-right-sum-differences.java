class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];
        int Lsum=0;
        for(int i = 0; i<n; i++){
            leftSum[i]=Lsum;
            Lsum+=nums[i];
        }
        int Rsum=0;
        for(int i = n-1;i>=0;i--){
            rightSum[i]=Rsum;
            Rsum+=nums[i];
        }
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            int val=leftSum[i]-rightSum[i];
            ans[i]=Math.abs(val);
        }
        return ans;
        
    }
}