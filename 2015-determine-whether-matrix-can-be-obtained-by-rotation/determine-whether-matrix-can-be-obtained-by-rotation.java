import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
         if(Arrays.deepEquals(mat,target)){
            return true;
         }
         int[][] ans = mat;
         for(int k=0;k<3;k++){
            int row = ans.length;
            int col = ans[0].length;
            int[][] res = new int[row][col];
            // transpose
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    res[j][i]=ans[i][j];
                }
            }
//reverse
for(int i=0;i<ans.length;i++){
int left=0;
int right=ans[i].length-1;
while(left<right){
    int temp = res[i][left];
    res[i][left]=res[i][right];
    res[i][right]=temp;
    left++;
    right--;

}
}
if(Arrays.deepEquals(res,target)){
    return true;
}
ans=res;
         }
         return false;
    }
}