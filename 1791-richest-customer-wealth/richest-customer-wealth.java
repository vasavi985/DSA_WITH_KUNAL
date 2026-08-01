class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        for(int i=0;i<accounts.length;i++){
            int sum_col =0;
            for(int j=0;j<accounts[i].length;j++){
                sum_col+=accounts[i][j];

            }
            if(sum_col>sum){
                sum=sum_col;
            }
        }
        return sum;
    }
}