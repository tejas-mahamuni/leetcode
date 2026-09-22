class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = 0;

        for (int item : set) {

            if(set.contains(item-1)) {
                continue;
            }

            int count = 0;
            int k = item;

            while (set.contains(k)) {
                count++;
                k++;
            } 

            max = Math.max(max, count);
        }
        return max;
    }
}