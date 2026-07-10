class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans =new ArrayList<>();
        int i =digits.length-1;
        int k=1;
        int carry=0;
        while(i>=0||k>0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=digits[i];
            }
            if(k>0){
                int digit=k%10;
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
            int temp = ans.get(left);
            ans.set(left, ans.get(right));
            ans.set(right, temp);
                left++;
                right--;

            }
        
        int[] answer = new int[ans.size()];
        for(int j=0;j<ans.size();j++){
            answer[j]=ans.get(j);
        }
        return answer;
    }
}