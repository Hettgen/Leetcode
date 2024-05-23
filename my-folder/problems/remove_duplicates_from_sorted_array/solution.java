class Solution {
    public int removeDuplicates(int[] nums) {
        
        int counter = 1;
        int lastVal = nums[0];

        // if(nums.length <= 1){
        //     return nums.length == 0 ? 0 : 1;
        // }
        
        for(int i = 0; i < nums.length; i++){

            if(nums[i] != lastVal){
                nums[counter] = nums[i];
                counter++;
            }
            lastVal = nums[i];


        }
        return counter;
    }
}