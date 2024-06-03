class Solution {
    public String mergeAlternately(String word1, String word2) {

        String merged = "";
        int index = 0;
        
        while(word1.length() > index && word2.length() > index){

            
            merged += String.valueOf(word1.charAt(index));
            merged += String.valueOf(word2.charAt(index));

            index++;

        }
        merged += word1.length() > word2.length() ? word1.substring(index) : word2.substring(index);

        return merged;

    }

    

}