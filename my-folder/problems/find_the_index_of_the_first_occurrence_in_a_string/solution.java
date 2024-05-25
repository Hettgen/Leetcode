class Solution {
    public int strStr(String haystack, String needle) {


        if(haystack.length() == 1 && needle.length() == 1){
            System.out.println("found");
            return 0;
        }

        for(int i = 0; i < haystack.length(); i++){

            if(i + needle.length() - 1 >= haystack.length()){
                return -1;
            }
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }

            
        }
        return -1;
    }





}