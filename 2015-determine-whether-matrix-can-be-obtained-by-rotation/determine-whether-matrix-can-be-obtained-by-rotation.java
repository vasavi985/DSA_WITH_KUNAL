import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        // Check 0° rotation
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }

        int[][] ans = mat;

        // Check 90°, 180°, and 270° rotations
        for (int k = 0; k < 3; k++) {

            int row = ans.length;
            int col = ans[0].length;
            int[][] res = new int[col][row];

            // Transpose
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    res[j][i] = ans[i][j];
                }
            }

            // Reverse each row
            for (int i = 0; i < row; i++) {
                int left = 0;
                int right = col - 1;

                while (left < right) {
                    int temp = res[i][left];
                    res[i][left] = res[i][right];
                    res[i][right] = temp;

                    left++;
                    right--;
                }
            }

            // Compare with target
            if (Arrays.deepEquals(res, target)) {
                return true;
            }

            // Use the rotated matrix for the next rotation
            ans = res;
        }

        return false;
    }
}