class Solution {
    public void setZeroes(int[][] matrix) {

        int col = 1;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        col = 0;
                    }
                    else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i=0; i<matrix[0].length; i++) {
            if (matrix[0][0] == 0) {
                matrix[0][i] = 0;
            }
        }
        for (int i=0; i<matrix.length; i++) {
            if (col == 0) {
                matrix[i][0] = 0;
            }
        }

        
    }
}
        // int[] rows = new int[matrix.length];
        // int[] cols = new int[matrix[0].length];

        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (matrix[i][j] == 0) {
        //             rows[i] = 1;
        //             cols[j] = 1;
        //         }
        //     }
        // }
        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (rows[i] == 1 || cols[j] == 1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }