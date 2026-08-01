class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digits = 0;
            int element = nums[i];
            while(element>0){
                digits++;
                element = element/10;

            }
            if(digits%2==0){
                count+=1;
            }
        }
return count;
        
    }
}