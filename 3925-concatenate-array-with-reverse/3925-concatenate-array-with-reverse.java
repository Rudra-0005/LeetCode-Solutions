class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int newNums[]=new int[2*nums.length];
        for(int i=0;i<n;i++){
            newNums[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            
            newNums[n+i]=nums[n-i-1];
        }
       return newNums; 
    }
}