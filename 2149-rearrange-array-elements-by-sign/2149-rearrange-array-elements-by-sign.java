class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] < 0) {
                temp[odd] = nums[i];
                odd += 2;
            }
            else {
                temp[even] = nums[i];
                even += 2;
            }
        }
        return temp;
    }
}