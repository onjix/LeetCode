class Solution {
    public int maxProfit(int[] prices) {
        int big = 0;
        int small = 10000;
        int value = 0;
        
        for(int i : prices) {
           if(i < small) {
               small = i;
           }
            big = i;
            
            if(big-small > value) {
                value = big-small;
            }
        }
        return value;
    }
}