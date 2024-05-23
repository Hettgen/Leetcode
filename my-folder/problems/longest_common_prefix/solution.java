class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = "";
        String comparisonVal = "";
        int counter = 0;
        int shortestLen = strs[0].length();
        
        for(int i = 0; i < strs.length; i++){

            if(strs[i].length() < shortestLen){
                shortestLen = strs[i].length();
            }
        }

        for(int i = 0; i < shortestLen; i++){
            for(int y = 0; y < strs.length; y++){
                if(strs[0].charAt(i) != strs[y].charAt(i)){
                    counter++;
                }
            }
            if(counter == 0){
                prefix += strs[0].charAt(i);
            }
            else{
                break;
            }
        }

        return prefix;
        
    }
}