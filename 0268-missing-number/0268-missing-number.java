class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // int sum0 = (n * (n + 1))/2;
        // int sum = 0;
        
        // for (int i=0; i<n; i++) {
        //     sum += nums[i];
        // }

        // return sum0 - sum;

        int i=0;
        while ( i < n) {
            int correct = nums[i];
            if (nums[i] < n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        for (int k=0; k<n; k++) {
            if (nums[k] != k) {
                return k;
            }
        }

        return n;
    }
}