class Solution {
    public int[][] transpose(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0 ) {
            return new int[0][0];
        }

        int[][] res = new int[matrix[0].length][matrix.length];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }
}