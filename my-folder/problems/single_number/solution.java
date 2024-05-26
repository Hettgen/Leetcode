class Solution {
    public int singleNumber(int[] nums) {
        
        int returnVal = exclusiveOr(nums, 0);

        return returnVal;

    }

    public static int exclusiveOr(int[] nums, int x){
        
        if(nums.length == 1){
            return nums[0];
        }

        if(x == nums.length - 1){
            return nums[x];
        }
        else{
            return nums[x] ^ exclusiveOr(nums, x + 1);
        }
    }
}

