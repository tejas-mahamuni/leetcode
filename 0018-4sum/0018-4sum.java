class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();

        // for (int i=0; i<nums.length; i++) {
        //     for (int j=i+1; j<nums.length; j++) {
        //         Set<Long> map = new HashSet<>();
        //         for (int k=j+1; k<nums.length; k++) {
        //             long sum = nums[i] + nums[j];
        //             sum += nums[k];
        //             long req = (long)target - sum;

        //             if (map.contains(req)) {
        //                 List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], (int) req));
        //                 Collections.sort(row);
        //                 result.add(row);
        //             }
        //             map.add((long)nums[k]);
        //         }
        //     }
        // }

        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j=i+1; j<nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;

                int start = j+1;
                int end = nums.length-1;

                while (start < end) {
                    long sum = nums[i] + nums[j];
                    sum += nums[start];
                    sum += nums[end];

                    if (sum < target) {
                        start++;
                    }
                    else if (sum > target) {
                        end--;
                    }
                    else {
                        List<Integer> row = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        result.add(row);

                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start-1]) start++;
                        while (start < end && nums[end] == nums[end+1]) end--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}