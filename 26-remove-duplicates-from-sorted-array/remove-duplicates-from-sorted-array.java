class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }

        // Copy unique elements back into nums
        for (int i = 0; i < ans.size(); i++) {
            nums[i] = ans.get(i);
        }

        return ans.size();
    }
}