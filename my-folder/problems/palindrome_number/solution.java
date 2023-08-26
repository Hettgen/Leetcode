class Solution {
    public boolean isPalindrome(int x) {
        String test = Integer.toString(x);
        StringBuilder testTwo = new StringBuilder(test);
        testTwo.reverse();
        
        
        /*for(int i = test.length()-1; i >= 0; i--){
            char ch = test.charAt(i);
            testTwo.append(ch);
            }    
        */
        return test.equals(testTwo.toString());
        
        
    }
}
