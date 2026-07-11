class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=0;
        int i = num.length-1;
        while(i>=0||k>0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=num[i];
            }
            if(k>0){
                int digit = k%10;
                sum+=digit;
            }
ans.add(sum%10);
carry=sum/10;
k=k/10;
i--;
        }
            int left=0;
            int right = ans.size()-1;
            while(left<right){
                int temp=ans.get(left);
                ans.set(left,ans.get(right));
                ans.set(right,temp);
                left++;
                right--;
            }
        
        return ans;
    }
}