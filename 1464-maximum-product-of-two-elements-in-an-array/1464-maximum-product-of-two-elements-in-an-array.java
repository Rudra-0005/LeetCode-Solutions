class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max =0;
        int max2=0;
        int count=0;
        for (int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }  
        }
            for(int val:nums){
                if(val==max)
                count ++;
            }
        for (int i=0;i<n;i++){
            if(max2<nums[i]&&nums[i]<max){
                max2=nums[i];
            }
        }
        if(count>1){
            max2=max;
        }
        


        return (max-1)*(max2 -1);
    }
}