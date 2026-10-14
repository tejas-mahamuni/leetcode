class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        int i=0; 

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        for (int k=0; k<nums.length; k++) {
            if (k+1 != nums[k]) {
                res[0] = nums[k];
                res[1] = k+1;
            }
        }
        return res;
    }
}