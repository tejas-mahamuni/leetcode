class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ( (long) m*k > bloomDay.length) {
            return -1;
        }

        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();

        while (min <= max) {
            int mid = min + (max - min)/2;

            if (countBq(bloomDay, mid, m, k)) {
                max = mid-1;
            } 
            else {
                min = mid+1;
            }
        }
        return min;
    }

    static boolean countBq(int[] arr, int day, int m, int k) {
        int count = 0;
        int bq = 0;

        for (int item : arr) {
            if (item <= day) {
                count++;
            }
            else {
                bq += count/k;
                count = 0;
            }
        }
        bq += count / k;

        return bq >= m;
    }
}