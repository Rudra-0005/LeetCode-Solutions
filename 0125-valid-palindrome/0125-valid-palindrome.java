class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 , right = s.length()-1;

        while(left<right){
            char i = s.charAt(left);
            char j = s.charAt(right);

            //Ignoring Blank spaces and comas form left to right
            if(!Character.isLetterOrDigit(i)){
                left++;
                continue;
            }
            //Ignoring blank spaces and comas from right to left
            if(!Character.isLetterOrDigit(j)){
                right--;
                continue;
            }

            if(Character.toLowerCase(i)!= Character.toLowerCase(j)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}