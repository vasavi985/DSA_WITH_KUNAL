import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target)){
            return true;
        }
int[][] ans = mat;
// for 90 180 270 degrees
for(int k=0;k<3;k++){
    //transpose of a matrix
    int row=ans.length;
    int col=ans[0].length;
    int[][] res = new int[col][row];
    for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[0].length;j++){
            res[j][i]=ans[i][j];
        }
    }
    //reverse of each row
    for(int i=0;i<res.length;i++){
        int left=0;
        int right=res[i].length-1;
        while(left<right){
            int temp=res[left][i];
            res[left][i]=res[right][i];
            res[right][i]=temp;
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