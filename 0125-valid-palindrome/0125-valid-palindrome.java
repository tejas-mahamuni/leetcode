class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");

        char[] arr = s.toLowerCase().toCharArray();
        for (char ch : arr) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(String.valueOf(ch));
            }
        }
        String og = sb.toString();
        String rev = sb.reverse().toString();

        return rev.equals(og);
    }
}