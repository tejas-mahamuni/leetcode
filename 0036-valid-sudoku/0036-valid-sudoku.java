class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<HashSet<Character>> row = new ArrayList<>();
        List<HashSet<Character>> col = new ArrayList<>();
        List<HashSet<Character>> box = new ArrayList<>();

        for (int i=0; i<9; i++) {
            row.add(new HashSet<>());
            col.add(new HashSet<>());
            box.add(new HashSet<>());
        }

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                char val = board[i][j];

                if (val == '.') {
                    continue;
                }

                if (row.get(i).contains(val)) return false;
                row.get(i).add(val);

                if (col.get(j).contains(val)) return false;
                col.get(j).add(val);

                int idx = (i/3) * 3 + (j/3);

                if (box.get(idx).contains(val)) return false;
                box.get(idx).add(val);
                
            }
        }
        return true;
    }
}