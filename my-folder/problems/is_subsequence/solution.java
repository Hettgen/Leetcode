class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int unmatched = s.length();

        for(int i = 0; i < t.length(); i++){
            
            if(unmatched == 0){
                return true;
            }
            if(s.charAt(s.length() - unmatched) == t.charAt(i)){
                unmatched--;
            }
        }
        return unmatched == 0;
    }
}