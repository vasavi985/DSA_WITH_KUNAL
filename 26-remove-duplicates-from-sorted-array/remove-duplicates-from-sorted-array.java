class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
                count+=1;

            }
        }
         
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
         return count;
    }
}