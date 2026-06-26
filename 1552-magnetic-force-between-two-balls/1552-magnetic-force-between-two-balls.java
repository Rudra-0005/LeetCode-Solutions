class Solution {
    static boolean isTrue(int []position,int m,int minDistance){
        int ballCount=1;
        int lastIdx=0;
        for(int i=0;i<position.length;i++){
        if(position[i]-position[lastIdx]>=minDistance){
            ballCount++;
            lastIdx=i;
            if(ballCount==m){
                return true;
            }
            
        }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int n=position.length;
        int e=position[n-1]-position[0];
        int s=0;
        int ans=0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isTrue(position,m,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}