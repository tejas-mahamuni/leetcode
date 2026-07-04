class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            HashMap<Integer, Integer> mp = new HashMap<>();
            int target = - nums[i];

            for (int j=i+1; j<nums.length; j++) {
                int req = target - nums[j];
                if (mp.get(req) != null) {
                    List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[j], req));
                    Collections.sort(row);
                    set.add(row);
                }
                else {
                    mp.put(nums[j], j);
                }
            }
        }
        return new ArrayList<>(set);
    }
}