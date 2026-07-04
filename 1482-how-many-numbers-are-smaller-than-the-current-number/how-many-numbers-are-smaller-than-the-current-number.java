class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    count+=1;
                }
            }
            ans.add(count);
        }
            int[] res = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                res[i]=ans.get(i);
            }
        
          return res;
    }

 
}