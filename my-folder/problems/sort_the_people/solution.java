class Solution {
    public String[] sortPeople(String[] names, int[] heights) {



        List<Integer> sortedHeights = new ArrayList<Integer>();


        for(int i = 0; i < heights.length; i++){
            if(sortedHeights.isEmpty()){
                sortedHeights.add(i);
            }
            else{
                for(int j = 0; j < sortedHeights.size(); j++){

                    if(heights[i] > heights[sortedHeights.get(j)]){
                        sortedHeights.add(j, i);
                        break;
                    }

                    else if(j == sortedHeights.size() - 1){
                        sortedHeights.add(i);
                        break;
                    }

                }
            }

        }
        
        String[] sortedByHeight = new String[heights.length];

        for(int i = 0; i < sortedByHeight.length; i++){

            sortedByHeight[i] = names[sortedHeights.get(i)];
        }

        

        return sortedByHeight;
    }
}