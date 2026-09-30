class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character, Integer>> pq = 
        new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int count = entry.getValue();

            while (count != 0) {
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
}