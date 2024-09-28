class Solution {
    public void duplicateZeros(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++){
            
            if(arr[i] == 0 ){
                int tempVal = 0;
                int currVal = 0;
                // shifting all elements
                for(int y = i+1; y < arr.length; y++){
                    if(y ==i + 1){
                        currVal = arr[y];
                        arr[y] = 0;
                    }
                    else{
                        tempVal = currVal;
                        currVal = arr[y];
                        arr[y] = tempVal;
                        
                    }
                    
                    
                }
                i++;
            }
            
        }
        
    }
    
    
}

    