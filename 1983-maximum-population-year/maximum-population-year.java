class Solution {
    public int maximumPopulation(int[][] logs) {
        int max=0;
        int ans=1950;
        for(int year=1950;year<=2050;year++){
            int count=0;
            for(int i=0;i<logs.length;i++){
                int birth=logs[i][0];
                int death = logs[i][1];
                if(year>=birth && year<death){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=year;
            }
        }
       return ans;
    }
}