class Solution {
    public int maxDepth(String s) {

        int depth = 0;
        int max = 0;

        for (Character ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
            }
            else if (ch == ')') {
                depth--;
            }

            if (max < depth) {
                max = depth;
            }
        }

        return max;
    }
}

//         Stack<Character> stack = new Stack<>();

//         int depth = 0;

//         for (Character ch : s.toCharArray()) {
//             if (ch == '(') {
//                 stack.push(ch);
//             }
//             else if (ch == ')') {
//                 stack.pop();
//             }

//             if (depth < stack.size()) {
//                 depth = stack.size();
//             }
//         }