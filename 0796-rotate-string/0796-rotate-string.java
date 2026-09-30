class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        else if (s.equals(goal)) {
            return true;
        }

        int n = s.length();

        for (int i=1; i<s.length(); i++) {
            String temp = s.substring(i,n) + s.substring(0, i);

            if (temp.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}