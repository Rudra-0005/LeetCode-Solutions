class Solution {
    public int differenceOfSum(int[] nums) {
        int EleSum=0;
        for(int val:nums){
            EleSum+=val;
        }
        int digiSum=0;
        for(int i =0;i<nums.length;i++){
            int digit=nums[i];
            while(digit!=0){
            int num=digit%10;
            digiSum+=num;
            digit/=10;
            }

        }
        return Math.abs(digiSum-EleSum);
        
    }
}