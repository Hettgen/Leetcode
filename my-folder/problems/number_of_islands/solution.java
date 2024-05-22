class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;

        for(int i = 0; i < grid.length; i++){
            for(int y = 0; y < grid[i].length; y++){
                if(grid[i][y] == '1'){
                    System.out.println("i: " + i + "\ny: " + y);
                    search(grid, i, y);
                    counter++;
                }
            }
        }
        return counter;

    }

    public void search(char[][] grid, int x, int y){


        if(x < grid.length  && y < grid[0].length && x >= 0 && y >= 0){
            if(grid[x][y] == '1'){

                grid[x][y] = '0';


                search(grid, x, y+1);
                search(grid, x, y-1);
                
                search(grid, x+1, y);
                search(grid, x-1, y);

                


            }
            
        }
        else{
            return;
        }

    }

}

