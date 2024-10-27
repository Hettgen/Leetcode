class Solution {
    public int findClosestNumber(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }

        int closest = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(Math.abs(nums[i]) < Math.abs(closest))
                closest = nums[i];
            if(Math.abs(nums[i]) == Math.abs(closest))
                closest = nums[i] > closest ? nums[i] : closest;

        }
        return closest;
    }
}