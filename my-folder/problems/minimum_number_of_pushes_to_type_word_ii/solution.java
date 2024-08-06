class Solution {
    public int minimumPushes(String word) {

        // 8 keys to press, any amt of values on key, multiple presses traverses key values

        char[] wordArray = word.toCharArray();

        List<Integer> repeatCount = findDistinct(wordArray);

        int uniqueLetters = 0;
        int totalCost = 0;
        for(int i = 0; i < repeatCount.size(); i++){

            uniqueLetters++;

            totalCost += repeatCount.get(i) * Math.ceil(uniqueLetters / 8.0);

        }

        return totalCost;

    }

    public List<Integer> findDistinct(char[] charArr){

        List<Integer> repeatCount = new ArrayList<Integer>();

        char tempChar = '0';
        int tempCount = 0;
        for(int i = 0; i < charArr.length; i++){

            tempChar = charArr[i];
            if(tempChar == '0')
                continue;

            for(int y = i; y < charArr.length; y++){
                if(charArr[y] == tempChar){
                    tempCount++;
                    charArr[y] = '0';
                }

            }
            repeatCount.add(tempCount);
            tempCount = 0;
        }

        Collections.sort(repeatCount, Collections.reverseOrder());

        return repeatCount;


    }
}