class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_reach=0;
        for(int i=0;i<n;i++){
            if(i>max_reach){
                return false;
            }
            int moves = i+nums[i];
            if(moves>max_reach){
                max_reach = moves;
            }
    if(max_reach>=nums.length-1){
        return true;
    }
        }
     return false;   
    }
}