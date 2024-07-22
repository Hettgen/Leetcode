class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();

        for(int i = 0; i < numRows; i++){
            
            ArrayList<Integer> layer = new ArrayList<Integer>();

            for(int y = 0; y < i+1; y++){

                
                
                
                if(y == 0 || y == i){
                    layer.add(1);
                    
                }
                
                
                else{
                    
                    System.out.println("Testing");
                    int temp1 = pascalTriangle.get(i-1).get(y-1);
                    int temp2 = pascalTriangle.get(i-1).get(y);

                    

                    layer.add(temp1 + temp2);
                }
                
            }

            pascalTriangle.add(layer);


        }

        
        return pascalTriangle;
        
    }
}