class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for (int i=0;i<n;i++){
            sum+=mat[i][i];
            int idx2=n-i-1;

            if(idx2!=i){
            sum+=mat[i][idx2];
            }
        }
        return sum;
    }
}