class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder res = new StringBuilder();

        for (int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if ( ch == '(') {
                if (!stack.isEmpty()) {
                    res.append(ch);
                }

                stack.push(ch);
            }
            else {
                stack.pop();

                if (!stack.isEmpty()) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}