class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> candyList = new ArrayList<Boolean>();

        int largestVal = 0;

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > largestVal){
                largestVal = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(extraCandies + candies[i] >= largestVal){
                candyList.add(true);
            }
            else{
                candyList.add(false);
            }
        }

        return candyList;

    }
}