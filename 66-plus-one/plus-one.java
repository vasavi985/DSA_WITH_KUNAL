class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans =new ArrayList<>();
        int k=1;
        int i=digits.length-1;
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
        Collections.reverse(ans);
        int[] res = new int[ans.size()];
        for(int j=0;j<ans.size();j++){
            res[j]=ans.get(j);
        }
        return res;
    }
}