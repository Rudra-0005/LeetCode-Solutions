class Solution {
    static boolean isTrue(int arr[],int m,int maxH){
        long totalWoodCollected=0;
        
        for(int i=0;i<arr.length;i++){
            if(maxH<arr[i]){
                long currentWoodCollected=arr[i]-maxH;
                totalWoodCollected += currentWoodCollected;
            }
            
        }
        if (totalWoodCollected>=m){
                return true;
            }
            else{
                return false;
            }
        
    }
    int maxHeight(int[] arr, int m) {
        
        
        int n=arr.length;
        
        int s=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=max)
            max=arr[i];
        }
        int e=max;
        
        int ans=0;
        
        while(s<=e){
            int mid =s+(e-s)/2;
            if(isTrue(arr,m,mid)){
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
