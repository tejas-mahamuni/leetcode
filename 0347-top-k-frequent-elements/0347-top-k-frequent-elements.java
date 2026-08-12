class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toList());

        int[] res= new int[k];

        for (int i=0; i<k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}