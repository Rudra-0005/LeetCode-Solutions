class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int Price:prices){
             if(Price < minPrice){
                minPrice=Price;
             }
             else{
                maxProfit=Math.max(maxProfit, Price - minPrice);
             }
             
        }
        return maxProfit;
    }
}