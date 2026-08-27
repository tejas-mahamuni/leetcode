class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Set<List<Integer>> set = new HashSet<>();

       for (int i=0; i<nums.length; i++) {
        int target = - nums[i];
        Map<Integer, Integer> map = new HashMap<>();
        for (int j=i+1; j<nums.length; j++) {
            int req = target - nums[j];
            if (map.containsKey(req)) {
                List<Integer> row = new ArrayList<>(Arrays.asList(req, nums[j], nums[i]));
                Collections.sort(row);
                set.add(row);
            }
            else {
                map.put(nums[j], j);
            }
        }
       }
       return new ArrayList<>(set);
    }
}