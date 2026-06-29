class Solution {
    public int largestAltitude(int[] gain) {
        int result=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            result=result+=gain[i];
            if (result>max){
                max=result;
            } 
        }
        return max;
    }
}