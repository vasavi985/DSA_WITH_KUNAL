class Solution {
    public int minCostToMoveChips(int[] position) {
        int min_cost = Integer.MAX_VALUE;
        for(int i=0;i<position.length;i++){
            int count=0;
            for(int j=0;j<position.length;j++){
                int diff = position[j]-position[i];
                if(diff%2!=0){
                    count+=1;
                }
            }
            if(count<min_cost){
                min_cost=count;
            }
        }
return min_cost;
    }
}