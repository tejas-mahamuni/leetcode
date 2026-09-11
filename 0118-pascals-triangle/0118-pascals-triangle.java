class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                }
                else {
                    List<Integer> prev = list.get(i-1);
                    int num = prev.get(j-1) + prev.get(j);
                    
                    row.add(num);
                }
            }
            list.add(row);
        }
        return list;
    }
}