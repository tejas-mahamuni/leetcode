class Solution {
    public int findMin(int[] nums) {
        int pivot = pivot (nums);

        if (pivot != -1) {
            return nums[pivot];
        }

        return nums[0];

    }

    static int pivot (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if ( mid < end && arr[mid] > arr[mid+1]) {
                return mid+1;
            }
            if ( mid > start && arr[mid] < arr[mid-1]) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1; 
    }
}