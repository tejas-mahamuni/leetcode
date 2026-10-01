class Solution {
    public int beautySum(String s) {
        if (s.length() <= 1) {
            return 0;
        }

        int ans = 0;

        for (int i=0; i<s.length(); i++) {
            int[] arr = new int[26];
            for (int j=i; j<s.length(); j++) {
                arr[s.charAt(j) - 'a']++;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int k : arr) {
                    if (k > 0) {
                        max = Math.max(k, max);
                        min = Math.min(k, min);
                    } 
                }

                ans += (max - min);
            }
        }
        return ans;
    }
}