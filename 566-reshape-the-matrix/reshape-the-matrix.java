class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
         int[][] ans = new int[r][c];
         int row = matrix.length;
         int col = matrix[0].length;
         int new_col=0;
         int new_row=0;
         if(row*col!=r*c){
            return matrix;
         }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[new_row][new_col]=matrix[i][j];
                new_col++;
                if(new_col==c){
                    new_row++;
                    new_col=0;
                }
            }
         }
            return ans;
         }
    
    }

