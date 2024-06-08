class Solution {
    public String reverseVowels(String s) {
        
        int first = 0;
        int last = s.length()-1;


        char[] returnArr = s.toCharArray();

        while(last > first){
            

            if(isVowel(s.charAt(first)) && isVowel(s.charAt(last))){

                char temp = s.charAt(first);
                returnArr[first] = returnArr[last];
                returnArr[last] = temp;

                first++;
                last--;

            }

            if(!isVowel(s.charAt(first))){
                first++;
            }
            if(!isVowel(s.charAt(last))){
                last--;
            }
        
            
        }

        s = new String(returnArr);

        return s;


    }


    public boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}