class Solution {
    public int numIslands(char[][] grid) {

        int result = 0; 
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    result++;
                    dfs(i, j, grid);
                }
            }
        }

        return result;



    }

    private void dfs(int i, int j, char[][] grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        dfs(i - 1, j, grid);
        dfs(i + 1, j, grid);
        dfs(i, j - 1, grid); 
        dfs(i, j + 1, grid);
    }
}
