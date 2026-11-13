class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int cur = 1;
        int left = 0;
        int right = result[0].length;
        int top = 0; 
        int bottom = result.length; 

        while(left < right && top < bottom){
        //top row 
        for(int i = left; i < right; i++){
            result[top][i] = cur;
            cur++;
        }
        top++;


        //right column
        for(int i = top; i < bottom; i++){
            result[i][right - 1] = cur; 
            cur++;
        }
        right--;

        //bottom row
        for(int i = right - 1; i >= left; i--){
            result[bottom - 1][i] = cur;
            cur++;
        }
        bottom--;



        //left column
        for(int i = bottom - 1; i >= top; i--){
            result[i][left] = cur;
            cur++;
        }
        left++;
        }
        return result;
    }
}