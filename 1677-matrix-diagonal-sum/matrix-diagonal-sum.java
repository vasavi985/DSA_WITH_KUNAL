class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result=0;
        for(int i=0;i<n ;i++){
            result=result+mat[i][i];
            result=result+mat[i][n-1-i];


        }
        if (n%2!=0){
            result = result-mat[n/2][n/2];
        }
       return result; 
    }
}