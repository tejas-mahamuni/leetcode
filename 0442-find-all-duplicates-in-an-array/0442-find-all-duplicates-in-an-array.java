class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int  i = 0;

        while ( i < nums.length ) {
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

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                list.add(nums[index]);
            }
        }
        return list;
    }
}