class Solution {
    public String addBinary(String a, String b) {
        
        String larger = a.length() > b.length() ? a : b;
        String smaller = a.length() <= b.length() ? a : b;

        char[] result = new char[larger.length() + 1];
        int carry = 0;

        for(int i = 0; i < larger.length() + 1; i++){
            int end = result.length - i - 1;
            if(i >= larger.length()){
                if(carry == 1){
                    result[end] = '1'; 
                }
                break;
            }

            char largerChar = larger.charAt(larger.length() - i - 1);
            
            if(i >= smaller.length()){
                
                if(largerChar == '1'){
                    result[end] = carry == 1 ? '0' : '1';
                }
                else{
                    result[end] = (char)(carry+'0');
                    carry = 0;
                }
            }
            else{
                char smallerChar = smaller.charAt(smaller.length() - i - 1);

                if(largerChar == '1' && smallerChar == '1'){
                    result[end] = (char)(carry+'0');

                    carry = 1;
                    
                }
                else if(largerChar == '1' || smallerChar == '1'){
                    result[end] = carry == 1 ? '0' : '1';

                }
                else{
                    result[end] = (char)(carry+'0');
                    carry = 0;

                }

            }

        }

        return new String(result).trim();



    }
}