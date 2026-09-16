class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int[] current = intervals[0];
        res.add(current);

        for (int[] arr : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];

            int start = arr[0];
            int end = arr[1];

            if (currentEnd >= start) {
                current[1] = Math.max(currentEnd, end);
            }
            else {
                current = arr;
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}