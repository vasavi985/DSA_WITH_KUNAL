class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         //reverse of an array
         for(int row=0;row<image.length;row++){
            int left=0;
            int right=image[row].length-1;
            while(left<right){
                int temp=image[row][left];
                image[row][left]=image[row][right];
                image[row][right]=temp;
                left++;
                right--;

            }
         }
         for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                image[row][col]=1-image[row][col];
            }
         }
         return image;
    }
}