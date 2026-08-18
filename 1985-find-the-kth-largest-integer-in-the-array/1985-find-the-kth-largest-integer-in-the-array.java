class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Arrays.sort(nums, (a,b)->{
        //     if (a.length()!= b.length()) {
        //         return Integer.compare(b.length(), a.length());
        //     }
        //     return b.compareTo(a);
        // });

        // return nums[k-1];

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });

        for (String num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}