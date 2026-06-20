class Solution {
    public int subtractProductAndSum(int n) {
        int multiplication=1;
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;

            multiplication=multiplication*rem;
            sum+=rem;
            n=n/10;

        }
        int result = multiplication-sum;
        return result;
    }
}