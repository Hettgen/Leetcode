class Solution {
    public int maxProfit(int[] prices) {

        // Find largest gap between values in prices;

        int largestDelta = 0;

       
        int tempVal1 = prices[0];


        for(int i = 0; i < prices.length - 1; i++){
            int tempVal2 = prices[i+1];

            if(tempVal2 - tempVal1 > largestDelta){
                largestDelta = tempVal2 - tempVal1;
            }

            if(tempVal1 > tempVal2){
                tempVal1 = tempVal2;
            }
        }

        return largestDelta;
        
    }
}