class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<int[]> res = new ArrayList<>();

        int[] currentInterval = intervals[0];
        res.add(currentInterval);

        for (int[] i : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int start = i[0];
            int end = i[1];

            if (currentEnd >= start) {
                currentInterval[1] = Math.max(currentEnd, end);
            }
            else {
                currentInterval = i;
                res.add(currentInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}