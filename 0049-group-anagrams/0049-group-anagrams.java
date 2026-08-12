class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}


// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> list = new ArrayList<>();

//         for (int i=0; i<strs.length; i++) {
//             List<String> list1 = new ArrayList<>();
//             for (int j=i+1; j<strs.length; j++) {
//                 if (valid(strs[i], strs[j])) {
//                     if (!list1.contains(strs[i])) {
//                         list1.add(strs[i]);
//                     }
//                     if (!list1.contains(strs[j])) {
//                         list1.add(strs[j]);
//                     }
//                 }
//             }
//             if (!list.stream().flatMap(List::stream).anyMatch(strs[i]::equals)) {
//                 if (!list1.contains(strs[i])) {
//                         list1.add(strs[i]);
//                     }
//                 list.add(list1);
//             }
//         }
//         return list;
//     }

//     public static boolean valid (String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int i=0; i<s.length(); i++) {
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//             map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
//         }

//         for (Map.Entry<Character, Integer> i : map.entrySet()) {
//             if (i.getValue() != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }