class Solution {
    public int lengthOfLastWord(String s) {

        int j = s.length() - 1;

        
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }

        int i = j;

        
        while (j >= 0 && s.charAt(j) != ' ') {
            j--;
        }

        return i - j;
    }
}