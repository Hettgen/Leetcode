class Solution {
    public void rotate(int[][] matrix) {

        // index in inside array represents which array in 2d array after
        // array number value in 2d array represents inverse index inside array after

        int operations = 0;
        int len = matrix.length;
        int index1 = 0;
        int index2 = 0;
        int movingValue = 0;
        int tempVal = 0;

        int levelsDone = 0;
        while(true){

            // Initializing search


            int newLoc = len - 1 - index1;




            if(operations == 0){
                System.out.println("Index1: " + index1 + " Index2: " + index2);
                if(index1 >= (len/2.0) - 1 && index2 >= len/2)
                    break;
                movingValue = matrix[index1][index2];
                tempVal = matrix[index2][newLoc];
                matrix[index2][newLoc] = movingValue;

                int tempIndex = newLoc;
                index1 = index2;
                index2 = tempIndex;
                
            }
            else if(operations < 4){
                movingValue = tempVal;
                tempVal = matrix[index2][newLoc];
                matrix[index2][newLoc] = movingValue;

                int tempIndex = newLoc;
                index1 = index2;
                index2 = tempIndex;
            }
            else{
                matrix[index2][newLoc] = tempVal;
                if(index2 >= len - 2 - levelsDone){
                    levelsDone++;
                    index1++;
                    index2 = levelsDone;
                }
                else{
                    index2++;
                }
                operations = -1;
            }

            operations++;
        }




    }


}