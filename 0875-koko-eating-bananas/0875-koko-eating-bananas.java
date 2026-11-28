class Solution {
    public boolean canEatAtTime(int []piles,int h,int mid){
        int hours = 0;
       
        for(int pile : piles){
            hours += (int)Math.ceil((double) pile/mid);
        }

        return hours<=h;
        
    }
    public int minEatingSpeed(int[] piles, int h ) {
        int max = 0;
        int min = 1;
        for(int pile : piles){
            max = Math.max(max,pile);
        }

        while(min<max){
            int mid = min + (max - min)/2;

            if(canEatAtTime(piles,h,mid)){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }
}