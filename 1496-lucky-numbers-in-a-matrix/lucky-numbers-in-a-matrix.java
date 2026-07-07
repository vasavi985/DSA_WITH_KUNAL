class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> row_min = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]<min){
                min=matrix[i][j];
            }
             
        }
        row_min.add(min);
        }
        
        int[][] new_matrix = new int [matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }
    ArrayList<Integer> row_max = new ArrayList<>();
        for(int i=0;i<new_matrix.length;i++){
            int max = new_matrix[i][0];
            for(int j=0;j<new_matrix[i].length;j++){
            if(new_matrix[i][j]>max){
                max=new_matrix[i][j];
            }
             
        }
        row_max.add(max);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<row_min.size();i++){
            for(int j=0;j<row_max.size();j++){
                if(row_min.get(i).equals(row_max.get(j))){
                    ans.add(row_min.get(i));
                }
            }
        }
        return ans;
}
}