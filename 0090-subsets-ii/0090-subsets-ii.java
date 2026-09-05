class Solution {
    static void solve(int nums[],List<Integer> output,int index, List<List<Integer>> ans){
            //base case
            if(index==nums.length){
            ans.add(new ArrayList<>(output));
            return;
            }
            // include
            int x = nums[index];
            output.add(x);
            solve(nums,output,index+1,ans);

            while(index+1 < nums.length && nums [index]== nums [index+1]){
                index++;
            }

            //exclude
            output.remove(output.size()-1);
            solve(nums,output,index+1,ans);
        }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,output,index,ans);
        return ans;
    }
}