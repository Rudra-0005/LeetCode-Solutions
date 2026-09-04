class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum=sum+nums[i];
            }
            else{
                break;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 3: Find the smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }
        
        return sum;
    }
    
}