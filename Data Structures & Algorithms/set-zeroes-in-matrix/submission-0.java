class Solution {
    public void setZeroes(int[][] matrix) {
        int width = matrix[0].length; //2
        int height = matrix.length; //2 
        int[][] mirror = new int[height][width]; 

        for(int i = 0; i < height; i++){  //00, 01, 10, 11
            for(int j = 0; j < width; j++){
                mirror[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(matrix[i][j] == 0){
                    for(int h = 0; h < height; h++){
                        mirror[h][j] = 0;
                    }
                    for(int w = 0; w < width; w++){
                        mirror[i][w] = 0;
                    }
                }
        }
        }

        for(int i = 0; i < height; i++){  //00, 01, 10, 11
            for(int j = 0; j < width; j++){
                matrix[i][j] = mirror[i][j];
            }
        }
}
}
