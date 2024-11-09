class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> jewelMap = new HashSet<Character>();


        for(int i = 0; i < jewels.length(); i++){
            jewelMap.add(jewels.charAt(i));
        }

        int answer = 0;
        for(int i = 0; i < stones.length(); i++){
            
            if(jewelMap.contains(stones.charAt(i)))
                answer++;

        }
        return answer;
    }
}