class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length == 0)
            return false;

        if(n == 0)
            return true;

        
        for(int i = 0; i < flowerbed.length; i++){

            if(canFit(flowerbed, i)){
                flowerbed[i] = 1;
                n--;
            }
            if(n == 0){
                return true;
            }
        }


        return n == 0;

    }

    public boolean canFit(int[] flowerbed, int i){
        
        if(flowerbed.length == 1){
            return flowerbed[i] == 0;
        }

        if(i == 0){
            return flowerbed[i] == 0 && flowerbed[i+1] == 0;
        }
        if(i == flowerbed.length - 1){
            return flowerbed[i] == 0 && flowerbed[i-1] == 0;
        }
        return flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0;
    }
}