class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            values.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){

            Integer index = values.get(target - nums[i]);
            if(index != null && index != i){
                return new int[]{i, values.get(target - nums[i])};
            }

        }
        return new int[]{0,0};
    }
}