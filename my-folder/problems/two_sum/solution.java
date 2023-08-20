class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int index1 = 0;
        int index2 = 0;

        Task:
        for (int i = 0; i < nums.length ; i++){
            for (int x = i + 1; x < nums.length ; x++){
                int sum = nums[i] + nums[x];
                if(sum == target){
                    
                    index1 = i;
                    index2 = x;
                    break Task;
                }
            }
        }
        return new int[] {index1, index2};

    }
}