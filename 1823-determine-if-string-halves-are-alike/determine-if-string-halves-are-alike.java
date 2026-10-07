class Solution {
    public boolean halvesAreAlike(String v) {
        String s=v.toLowerCase();
        int count1=0;
        for(int i=0;i<s.length()/2;i++){
            char ch1 = s.charAt(i);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
                count1+=1;
            }

        }
        int count2=0;
        for(int i=s.length()/2;i<s.length();i++){
            char ch2 = s.charAt(i);
            if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                count2+=1;
            }

        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}