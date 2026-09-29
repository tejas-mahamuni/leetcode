class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String res = strs[0];
        // int len = res.length();

        // for (int i=1; i<strs.length; i++) {
        //     String s = strs[i];
        //     while (len > s.length() || !res.equals(s.substring(0, len))) {
        //         len--;

        //         if (len == 0) {
        //             return "";
        //         }
        //         res = res.substring(0, len);
        //     }
        // }
        // return res;

        Arrays.sort(strs);

        String prefix = strs[0];
        int len = strs[0].length();

        String last = strs[strs.length-1];

        while (len > last.length() || !prefix.equals(last.substring(0, len))) {
            len--;

            if (len == 0) {
                return "";
            }

            prefix = prefix.substring(0, len);
        }
        return prefix;
    }
}