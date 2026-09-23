class Solution {
    public int minOperations(int[] nums, int x) {
        
       int total = Arrays.stream(nums).sum();

       int target = total - x;

       int left = 0;
       int maxlen = -1;

        int sum = 0;

       for (int right=0; right<nums.length; right++) {
            sum += nums[right];

            while (left <= right && sum > target) {
                sum -= nums[left++];
            }

            if (sum == target) {
                maxlen = Math.max(maxlen, right-left+1);
            } 
       }

       return maxlen == -1 ? -1 : nums.length - maxlen;
    }
}