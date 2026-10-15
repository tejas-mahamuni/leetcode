class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while ( i < nums.length ) {
            int correct = nums[i] - 1;

            if (correct >= 0 && correct < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        for (int index=0; index<nums.length; index++) {
            if (index + 1 != nums[index]) {
                return index + 1;
            }
        }
        return i+1;
    }
}