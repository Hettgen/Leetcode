class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int suffix = 1;
        
        for(int i = 0; i < nums.length; i++){

            answer[i] = 1;
        }

        //prefix section
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i--){
            suffix = suffix * nums[i + 1];
            answer[i] = answer[i] * suffix;
        }


        return answer;
    }
}