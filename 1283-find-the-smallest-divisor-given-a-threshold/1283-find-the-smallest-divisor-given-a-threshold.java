class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Arrays.stream(nums).max().getAsInt();
        return binarySearch(nums, 1, max, threshold);
    }

    static int reminderSum (int[] arr, int div) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += Math.ceil((double) arr[i]/div);
        }
        return sum;
    }

    static int binarySearch(int[] arr, int start, int end, int threshold) {

        int ans = end;
        while (start <= end) {
            int mid = start + (end-start)/2;

            int sum = reminderSum(arr, mid);

            if (sum <= threshold) {
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}