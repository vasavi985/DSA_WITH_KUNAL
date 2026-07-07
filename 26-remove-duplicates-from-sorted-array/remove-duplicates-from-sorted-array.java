class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int res = 0;
        for(int i=0;i<nums.length;i++)
        if(!ans.contains(nums[i])){
            ans.add(nums[i]);
            res+=1;
        }
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        return res;
    }
}