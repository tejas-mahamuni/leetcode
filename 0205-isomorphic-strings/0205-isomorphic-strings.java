class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!map.containsKey(original)) {
                if (set.contains(replacement)) {
                    return false;
                }
                map.put(original, replacement);
                set.add(replacement);
            }
            else if (map.get(original) != replacement) {
                return false;
            }
        }

        return true;
    }
}