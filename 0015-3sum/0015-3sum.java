class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Set<List<Integer>> set = new HashSet<>();

    //    for (int i=0; i<nums.length; i++) {
    //     int target = - nums[i];
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int j=i+1; j<nums.length; j++) {
    //         int req = target - nums[j];
    //         if (map.containsKey(req)) {
    //             List<Integer> row = new ArrayList<>(Arrays.asList(req, nums[j], nums[i]));
    //             Collections.sort(row);
    //             set.add(row);
    //         }
    //         else {
    //             map.put(nums[j], j);
    //         }
    //     }
    //    }

    Arrays.sort(nums);

    for (int i=0; i<nums.length; i++) {
        if (i > 0 && nums[i] == nums[i-1]) continue;

        int j = i+1;
        int k = nums.length-1;

        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];

            if (sum == 0) {
                List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                set.add(row);
                j++;
                k--;
                while (j < k && nums[j] == nums[j-1]) j++;
                while (j < k && nums[k] == nums[k+1]) k--;
            }
            else if (sum < 0) {
                j++;
            }
            else {
                k--;
            }
        }
    }
       return new ArrayList<>(set);
    }
}