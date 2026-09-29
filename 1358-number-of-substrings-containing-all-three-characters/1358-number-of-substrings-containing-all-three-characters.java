class Solution {
    public int numberOfSubstrings(String s) {
        
        int count = 0;

        int[] state = {-1, -1, -1};

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') state[0] = i;
            if (s.charAt(i) == 'b') state[1] = i;
            if (s.charAt(i) == 'c') state[2] = i;

            count += Math.min(state[0], Math.min(state[1], state[2])) + 1;
        }

        return count;
    }
}