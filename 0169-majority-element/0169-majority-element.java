class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == maj) count++;
            else {
                count--;
                if (count < 0) {
                    count = 0;
                    maj = nums[i];
                }
            }
        }
        return maj;
    }
}