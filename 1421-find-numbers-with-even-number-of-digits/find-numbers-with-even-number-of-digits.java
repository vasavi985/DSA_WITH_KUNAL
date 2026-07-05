class Solution {
    public int findNumbers(int[] nums) {
         int result=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n = nums[i];
            while(n>0){
                n=n/10;
                count+=1;
            }
            if(count%2==0){
                result+=1;
            }
        }
        return result;
    }
}