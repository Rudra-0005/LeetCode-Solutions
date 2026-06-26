class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i =0;i<arr.length-2;i++){
            int a=arr[i];
            int b=arr[i+1];
            int c=arr[i+2];
            if(((a&1) !=0)&&((b&1) !=0) && ((c&1) !=0)){
                return true;

            }
           
        }
         return false;
    }
}