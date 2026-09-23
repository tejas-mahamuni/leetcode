class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (Arrays.stream(candies).asLongStream().sum() < k) {
            return 0;
        }
        int max = Arrays.stream(candies).max().getAsInt();

        int start = 1;
        int end = max;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (possible(candies, k, mid)) {
                start = mid+1;
            } 
            else {
                end = mid-1;
            }
        }
        return start-1;
    }

    static boolean possible (int[] arr, long k, int can) {
        long children = 0;

        for (int i=0; i<arr.length; i++) {

            children += arr[i] / can; 

            if (children >= k) return true;
        }
        return false;
    }
}