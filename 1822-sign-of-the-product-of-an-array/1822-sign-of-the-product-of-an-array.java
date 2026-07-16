class Solution {
    public int arraySign(int[] nums) {
        int n =nums.length;
        int negiCount=0;
        for(int i = 0 ;i<n;i++){
            if(nums[i]==0)return 0;

            if(nums[i]<0) negiCount++;
        }
        
        if((negiCount&1)==0){
            return 1;
        }
        return -1;


    }

}