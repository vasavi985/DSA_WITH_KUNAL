class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int red=0;
        int white=0;
        int blue=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                red++;
            }
            if(nums[i]==1){
                white++;
            }
            if(nums[i]==2){
                blue++;
            }

        }
        for(int i=0;i<red;i++){
            ans.add(0);
            
        }
        for(int i=0;i<white;i++){
            ans.add(1);
            
        }
         for(int i=0;i<blue;i++){
            ans.add(2);
            
        }
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        
         
  
    }
}