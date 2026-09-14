class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                Set<Long> map = new HashSet<>();
                for (int k=j+1; k<nums.length; k++) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long req = (long)target - sum;

                    if (map.contains(req)) {
                        List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], (int) req));
                        Collections.sort(row);
                        result.add(row);
                    }
                    map.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}