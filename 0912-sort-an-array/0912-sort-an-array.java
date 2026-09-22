class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);

        return nums;
    }

    static void mergeSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end- start)/2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    static void merge(int[] nums, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();

        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            }
            else {
                temp.add(nums[right++]);
            }
        }

        while (left <= mid) {
            temp.add(nums[left++]);
        }

        while (right <= end) {
            temp.add(nums[right++]);
        }

        for (int i=start; i<=end; i++) {
            nums[i] = temp.get(i-start);
        }
    }
}