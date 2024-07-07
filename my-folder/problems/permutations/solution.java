class Solution {
    public List<List<Integer>> permute(int[] nums) {

        int permutations = factorial(nums.length);

        List<List<Integer>> returnList = new ArrayList<List<Integer>>();


        returnList = permutations(nums);

        return returnList;
        
    }

    public static int factorial(int num){
        if(num == 1){
            return num;
        }
        else{
            return num * factorial(num - 1);
        }
    }

// List<List<Integer>> 
    public static List<List<Integer>> permutations(int[] nums){

        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

        if(nums.length > 1){

            for(int i = 0; i < nums.length; i++){
                


                int[] newarr = new int[nums.length - 1];
                int z = 0;
                for(int y = 0; y < nums.length; y++){

                    if(y != i){
                       newarr[z] = nums[y];
                       z++;
                    }
                    
                    

                }

                List<List<Integer>> permutations = permutations(newarr);
                



                for(List<Integer> permutation : permutations){ 

                    permutation.add(nums[i]);


                    returnList.add(permutation);

                    

                }

            
            }
        }
        else{
            ArrayList<Integer> lastVal = new ArrayList<Integer>();
            lastVal.add(nums[0]);

            returnList.add(lastVal);
        }
        


        return returnList;


    }

}