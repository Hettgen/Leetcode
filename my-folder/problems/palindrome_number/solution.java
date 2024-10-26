class Solution {
    public boolean isPalindrome(int x) {
        
        String value = Integer.toString(x);

        int firstVal = 0;
        int lastVal = value.length() - 1;
        while(firstVal < lastVal){
            
            if(value.charAt(firstVal) != value.charAt(lastVal)){
                return false;
            }
            firstVal++;
            lastVal--;
        }
        return true;



    }
}