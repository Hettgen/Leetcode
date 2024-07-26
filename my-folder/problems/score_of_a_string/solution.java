class Solution {
    public int scoreOfString(String s) {

        int total = 0;

        int val1 = 0;
        int val2 = 0;


        for(int i  = 0; i < s.length() - 1; i++){
            val1 = (int)s.charAt(i);
            val2 = (int)s.charAt(i+1);

            total += Math.abs(val1 - val2);
        }
        
        return total;
    }
}