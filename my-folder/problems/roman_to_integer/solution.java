class Solution {
    public int romanToInt(String s) {

        int x = iterateRoman(s, 0);
        
        return x;
    }

    public int iterateRoman(String s, int x){
        int val = 0;
        char nextChar = 'Z';
        char pastChar = 'Z';
        if(x > 0) pastChar = s.charAt(x-1);
        if(x < s.length()-1) nextChar = s.charAt(x+1);

        
        if(x > s.length() - 1){
            return val;
        }

        if(s.charAt(x) == 'M'){
            val = pastChar=='C' ? 900 : 1000;
        }
        if(s.charAt(x) == 'D'){
            val = pastChar=='C' ? 400 : 500;
        }
        if(s.charAt(x) == 'C'){
            if(nextChar == 'D' || nextChar == 'M') val = 0;
            else val = pastChar=='X' ? 90 : 100;
        }
        if(s.charAt(x)=='L'){
            val = pastChar=='X' ? 40 : 50;
        }
        if(s.charAt(x)=='X'){
            if(nextChar == 'L' || nextChar == 'C') val = 0;
            else val = pastChar=='I' ? 9 : 10;
        }
        if(s.charAt(x)=='V'){
            val = pastChar=='I' ? 4 : 5;
        }
        if(s.charAt(x)=='I'){
            if(nextChar == 'V' || nextChar == 'X') val = 0;
            else val = 1;
        }
        return val + iterateRoman(s, x+1);
    }
}