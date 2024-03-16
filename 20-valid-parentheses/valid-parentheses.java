class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int stack_pointer = -1;
        for (int i = 0; i < s.length(); i++) {
            char parentheses = s.charAt(i);
            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                stack[++stack_pointer] = parentheses;
            } else {
                if (stack_pointer == -1)
                    return false;
                char last_parentheses = stack[stack_pointer--];
                if ((last_parentheses == '{' && parentheses == '}')
                        || (last_parentheses == '(' && parentheses == ')')
                        || (last_parentheses == '[' && parentheses == ']')) {

                } else
                    return false;
            }
        }
        if (stack_pointer == -1)
            return true;
        else
            return false;
    }
}