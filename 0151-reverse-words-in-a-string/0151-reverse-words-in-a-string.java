class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        s = s.trim();

        String[] words = s.split("\\s+");

        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start++] = words[end];
            words[end--] = temp;
        }

        return String.join(" ", words);
    }
}