class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        /**
 * Compare top left neighbor.
 *
 * Time Complexity: O(M * N)
 *
 * Space Complexity: O(1)
 *
 * M = Number of rows. N = Number of columns.
 */

        if (matrix == null) {
            throw new IllegalArgumentException("Input is null");
        }

        if (matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
    