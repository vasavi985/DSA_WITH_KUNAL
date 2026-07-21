class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        for(int i=0;i<nums.length;i++){
            if(i>max_reach){
                return false;
            }
            int moves = i+nums[i];
            if(moves>max_reach){
                max_reach=moves;
            }
            
        }
 if(max_reach>=nums.length-1){
                return true;
            }
            return false;
    }
}