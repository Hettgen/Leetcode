class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();

        // for(int i = 0; i < nums.length; i++){

        //     sum.put(nums[i], i);
        // }

        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];
            Integer index = sum.get(complement);

            
            if(index != null){
                return new int[] {index, i};
            }
            sum.put(nums[i], i);

        }
        return new int[] {2,2};
    }
}