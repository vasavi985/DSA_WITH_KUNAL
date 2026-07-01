class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
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
        int count=0;
for(int i=0;i<items.size();i++){
    if(items.get(i).get(column).equals(ruleValue)){
        count+=1;
    }

}
       return count;  
        
    }
}