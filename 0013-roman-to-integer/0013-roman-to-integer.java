class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        char prev = 'A';

        for (int i=s.length()-1; i>=0; i--) {
            int value = map.get(s.charAt(i));

            if (value >= res || s.charAt(i) == prev) {
                res += value;
            }
            else {
                res -= value;
            }

            prev = s.charAt(i);
        }

        return res;
    }
}