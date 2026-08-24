class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int[] res = new int[2];

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i+1, j+1};
            }
            else if (target > nums[i] + nums[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{i+1, j+1};
    }
}