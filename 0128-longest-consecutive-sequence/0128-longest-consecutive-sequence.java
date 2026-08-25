class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = 0;

        for (int i : nums) {
            int count = 0;
            int k = i;

            if (set.contains(k-1)) {
                continue;
            }

            while (set.contains(k)) {
                count++;
                k++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}