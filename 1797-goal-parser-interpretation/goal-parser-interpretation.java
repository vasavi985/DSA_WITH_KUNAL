class Solution {
    public String interpret(String command) {
        String result = "";
        for(int i=0;i<command.length();i++){
            char ch = command.charAt(i);
            if(ch=='G'){
                result=result+'G';
            }
            else if(ch=='(' &&  command.charAt(i+1)==')'){
                result = result+'o';
                i+=1;
            }
            else{
                result = result + "al";
                i+=3;
            }

             
        }
        return result;
    }
}