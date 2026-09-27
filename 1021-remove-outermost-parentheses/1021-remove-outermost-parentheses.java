class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();

        int depth = 0;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if ( ch == '(' && depth++ > 0) {
                res.append(ch);
            }
            
            if ( ch == ')' && depth-- > 1) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}


        // Stack<Character> stack = new Stack<>();

        // StringBuilder res = new StringBuilder();

        // for (int i=0; i<s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if ( ch == '(') {
        //         if (!stack.isEmpty()) {
        //             res.append(ch);
        //         }

        //         stack.push(ch);
        //     }
        //     else {
        //         stack.pop();

        //         if (!stack.isEmpty()) {
        //             res.append(ch);
        //         }
        //     }
        // }