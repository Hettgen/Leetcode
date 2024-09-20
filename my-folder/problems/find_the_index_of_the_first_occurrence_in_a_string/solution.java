class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i = 0; i < haystack.length(); i++){
            
            if(haystack.charAt(i) == needle.charAt(0) && needle.length() <= haystack.length() - i){
                if(haystack.substring(i,i + needle.length()).equals(needle)){
                    return i;
                }
                else{
                    
                }
            }
        }
        
        return -1;
        
        
    }
    // Search given string for substring

}