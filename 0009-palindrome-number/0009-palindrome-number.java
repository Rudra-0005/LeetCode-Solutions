class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int mask=x;
        int ans=0;
        while (mask>0){
            int digit=mask;
            digit = digit %10;
            ans=ans*10+digit;
            mask=mask/10;
        }
        if(ans==x){
            return true;
        }
        return false;
         

    }
}