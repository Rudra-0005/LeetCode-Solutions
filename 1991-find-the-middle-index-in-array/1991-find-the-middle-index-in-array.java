class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int ans []=new int[n];
        int Tsum=0;
        for(int i=0;i<n;i++){
            Tsum+=nums[i];
        }
        int Lsum=0;
        for(int i=0;i<n;i++){
            int Rsum=Tsum-Lsum-nums[i];
            ans[i]=Lsum-Rsum;
            if(ans[i]==0){
                return i;
            }
            Lsum+=nums[i];
        }
        return -1;
    }
}