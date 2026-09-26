class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
            int start = 0;
            int end = mat[0].length-1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                int row = findMax(mat, mid);

                int left = (mid - 1 >= 0) ? mat[row][mid-1] : -1;
                int right = (mid + 1 <= end) ? mat[row][mid+1] : -1;

                if (mat[row][mid] > left && mat[row][mid] > right) {
                    return new int[] {row, mid};
                }
                else if (mat[row][mid] < left) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        return new int[]{-1, -1};
    }

    static int findMax(int[][] arr, int col) {
        int max = -1;
        int index = -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
}