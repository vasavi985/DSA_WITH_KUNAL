class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        int new_row =0;
        int new_col=0;
        if(row*col!=r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ans[new_row][new_col]=mat[i][j];
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