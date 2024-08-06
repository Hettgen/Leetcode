class Solution {
    public int majorityElement(int[] nums) {
        // List <Integer>
        int tempCounter = 0;
        int firstDiff = 0;

        for(int i = 0; i < nums.length; i++){

            for(int y = i; y < nums.length; y++){

                if(nums[y] == nums[i]){
                    tempCounter++;
                }
                if(nums[y] != nums[i] && firstDiff == 0){
                    firstDiff = y;
                }
                
                if(tempCounter > (nums.length / 2)){
                    return nums[i];
                }
                    
            }

            if(firstDiff != 0){
                i = firstDiff - 1;
                firstDiff = 0;
            }
            tempCounter = 0;
        }
        return 0;
    }
}