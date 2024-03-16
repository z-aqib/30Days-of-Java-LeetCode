class Solution {
    public boolean isValid(String s) {
        /*
         * so the approach is that we create a stack of characters and we have a
         * stack_pointer. so whenver we get an open-parentheses, we push it into the
         * stack. when we get a closed-parentheses, we pop the last added parentheses
         * and check, is it same as the closed one? if yes, continue checking the
         * string. if not, reject the string. at the end, if our stack is empty that
         * means all open have found their corresponding closed ones, accept s, else
         * reject.
         */
        char[] stack = new char[s.length()];
        int stack_pointer = -1;
        for (int i = 0; i < s.length(); i++) {
            char parentheses = s.charAt(i);
            if (parentheses == '(' || parentheses == '{' || parentheses == '[')
                stack[++stack_pointer] = parentheses;
            else {
                if (stack_pointer == -1)
                    return false;
                char last_parentheses = stack[stack_pointer];
                if ((last_parentheses == '{' && parentheses == '}')
                        || (last_parentheses == '(' && parentheses == ')')
                        || (last_parentheses == '[' && parentheses == ']')) {
                    stack_pointer--;
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