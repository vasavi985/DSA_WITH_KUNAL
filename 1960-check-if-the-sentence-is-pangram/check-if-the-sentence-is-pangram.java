class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            alphabet[ch-'a']=true;
        }
        for(int i=0;i<26;i++){
            if(!alphabet[i]){
                return false;
            }
        }
        return true;
    }
}