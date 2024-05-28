class Solution {
    public int lengthOfLongestSubstring(String s) {

        int substringSize = 0;
        int counter = 0;

        if(s.length() == 1){
            return 1;
        }

        for(int i = 0; i < s.length(); i++){
            
            if( i > 0){
                for(int y = i - 1; y >= 0; y--){
                    if(s.charAt(i) == s.charAt(y)){
                        if(counter > substringSize){
                            substringSize = counter;
                        }
                        counter = 0;
                        i = 0;
                        s = s.substring(y+1);
                        break;
                    }
                }
                

            }
            counter++;

        }

        return counter > substringSize ? counter : substringSize;


    }


}