class Solution {
    public int[] plusOne(int[] digits) {

        boolean toExtend = false;

        for(int i = digits.length - 1; i >= 0 ; i--){

            if(digits[i] == 9 && i > 0){
                digits[i] = 0;
            }
            else if(digits[i] == 9 && i == 0){
                toExtend = true;
                break;
            }
            else{
                digits[i] += 1;
                break;
            }
        }



        if(toExtend == false)
            return digits;

        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;


    }
}