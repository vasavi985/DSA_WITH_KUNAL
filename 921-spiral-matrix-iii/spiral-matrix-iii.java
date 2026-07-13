class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        ans[0][0]=rStart;
        ans[0][1]=cStart;
        int index=1;
        int r = rStart;
        int c = cStart;
        int steps=1;
        while (index < rows * cols) {
        for (int i = 0; i < steps; i++) {
             c++;
             if(r>=0 && r<rows && c>=0 && c<cols){
                ans[index][0] = r;
                ans[index][1]=c;
                index++;
             }
        }
        for(int i=0;i<steps;i++){
            r++;
            if(r>=0 && r<rows && c>=0 && c<cols ){
                ans[index][0]=r;
                ans[index][1]=c;
                index++;
            }

        }
         steps++;
         for(int i=0;i<steps;i++){
            c--;
             if(r>=0 && r<rows && c>=0 && c<cols ){
                ans[index][0]=r;
                ans[index][1]=c;
                index++;
            }
         }
         for(int i=0;i<steps;i++){
            r--;
             if(r>=0 && r<rows && c>=0 && c<cols ){
                ans[index][0]=r;
                ans[index][1]=c;
                index++;
            }
         }
steps++;
        }
return ans;

        
    }
}