class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        

        if (k == 1) {
            int ans = -1;
            for (Map.Entry<Integer, Integer> elem : map.entrySet()) {
                if (elem.getValue() == 1) {
                    ans = Math.max(ans, elem.getKey());
                }
            }
            return ans;
        }
        if (k == nums.length) {
            int ans = Integer.MIN_VALUE;
            for (int elem : nums) {
                ans = Math.max(ans, elem);
            }
            return ans;
        }

        int ans = -1;
        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (map.get(nums[nums.length-1]) == 1) {
            ans = Math.max(ans, nums[nums.length-1]);
        }
        return ans;
    }
}