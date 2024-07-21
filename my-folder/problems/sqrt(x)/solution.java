class Solution {
    public int mySqrt(int x) {
        
        // Math.floor()
        int oddNumber = 1;
        int counter = 0;

        while(x > 0){
            x -= oddNumber;
            oddNumber += 2;
            counter++;
        }
        if(x == 0)
        return counter;

        return counter - 1;
    }



}