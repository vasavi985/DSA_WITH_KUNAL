class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> ans =new ArrayList<>();
        if(n%2!=0){
            ans.add(0);
        }
        for(int i=1;i<=n/2;i++){
            ans.add(-i);
            ans.add(i);
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
         return res;
    }
}