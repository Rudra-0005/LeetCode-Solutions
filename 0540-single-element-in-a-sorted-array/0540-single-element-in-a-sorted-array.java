class Solution {
    public int singleNonDuplicate(int[] nums) {
        int bit=0;
        for(int val:nums){
            bit=bit^val;
        }
        return bit;
    }
}