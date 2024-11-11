class Solution {
    public int countPrimes(int n) {

        boolean[] primesFound = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){

            if(primesFound[i] == false)
                count++;
            for(int j = 2; j * i < n; j++){
                primesFound[j*i] = true;
            }
        }
        return count;

    }

}