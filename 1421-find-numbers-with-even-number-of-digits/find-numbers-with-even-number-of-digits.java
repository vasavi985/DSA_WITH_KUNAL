class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int num=nums[i];
            while(num>0){
                num=num/10;
                count+=1;
            }
            if(count%2==0){

            res+=1;

            }
        }
        return res;
    }
}