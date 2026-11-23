class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> m = new HashMap<>(Map.of(')', '(', '}', '{', ']', '['
            ));
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        int i = 0;
        while (i < c.length) {
            if (stack.empty() == true) {
                stack.push(c[i]);
                i++;
                continue;
            }

            if (m.keySet().contains(c[i])) {
                if(stack.peek() != m.get(c[i])){
                    System.out.println(stack.peek());
                    return false;
                }
                else if(stack.peek() == m.get(c[i])){
                    stack.pop();
                }
                
            }
            else{
                stack.push(c[i]);
            }
            i++;
        }
        boolean result = stack.empty();
        return result;
    }
}
