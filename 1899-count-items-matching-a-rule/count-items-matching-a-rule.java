class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int column=0;
        if(ruleKey.equals("type")){
            column=0;

        }
        if(ruleKey.equals("color")){
            column=1;
        }
        if(ruleKey.equals("name")){
            column=2;
        }
        for(int i=0;i<items.size();i++){
            if (items.get(i).get(column).equals(ruleValue)){
                count++;
            }
        }
return count;
    }
}