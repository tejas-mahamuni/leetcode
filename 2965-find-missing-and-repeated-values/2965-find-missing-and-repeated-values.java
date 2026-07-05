class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long N = grid.length * grid.length;

        long sum = (N * (N + 1)) / 2;
        long sumS = (N * (N + 1) * (2 * N + 1)) / 6;

        long actualSum = 0;
        long actualSumS = 0;

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
                actualSum += grid[i][j];
                actualSumS += grid[i][j] * grid[i][j];
            }
        }

        long diff1 = actualSum - sum;
        long diff2 = actualSumS - sumS;

        long sum1 = diff2 / diff1;

        int dup = (int) (sum1 + diff1) / 2;
        int miss = (int) (sum1 - diff1) / 2;


        return new int[]{dup, miss};
    }
}