class Solution {
    public int minCostToMoveChips(int[] position) {
        int min_cost=Integer.MAX_VALUE;
        for(int i=0;i<position.length;i++){
            int cost=0;
            for(int j=0;j<position.length;j++){

                int diff = Math.abs(position[j] - position[i]);
                if(diff%2!=0){
                    cost+=1;

                }
                 
                
            }
             if(cost<min_cost){
                    min_cost=cost;
                }
            
        }
        return min_cost;
    }
}