class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if(!stack.empty()) {
                char top = stack.peek();
                if(map.get(top).equals(ch)) {
                    stack.pop();
                } else if (map.containsValue(ch)) {
                    return false;
                } else {
                    if(!map.containsKey(ch))
                        return false;
                    stack.push(ch);
                }
            } else {
                if(!map.containsKey(ch))
                    return false;
                stack.push(ch);
            }
        }
        return stack.empty();     
    }
}