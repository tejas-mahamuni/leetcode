class Solution {
    public int search(int[] arr, int target) {
        int pivot = pivot(arr);

        if (pivot == -1) {
            return binary(arr, target, 0, arr.length-1);
        }

        int first = binary (arr, target, 0, pivot);
        if (first != -1) {
            return first;
        }

        return binary (arr, target, pivot+1, arr.length-1);
    }

    static int pivot (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if ( mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if ( mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
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

    static int binary (int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if ( arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}