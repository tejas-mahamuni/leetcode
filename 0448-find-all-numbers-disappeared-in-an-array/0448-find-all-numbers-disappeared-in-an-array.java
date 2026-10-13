class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i=0;
        while (i < nums.length) {
            int correct = nums[i]-1;

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
        for (int k=0; k<nums.length; k++) {
            if (k+1 != nums[k]) {
                list.add(k+1);
            }
        }

        return list;
    }
}