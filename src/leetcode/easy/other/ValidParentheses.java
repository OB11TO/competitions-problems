package leetcode.easy.other;

import java.util.Stack;

public class ValidParentheses {

    private static final String string = "([{}])"; // valid
    private static final String string2 = "([{})]"; // no valid
    private static final String string3 = "([{)]}"; // no valid

    public static void main(String[] args) {
        System.out.println(isValid(string));
    }

    /**
     * Проверяет только правильность введенных скобок
     * Если скобок хватит, но порядок другое - false
     * <p>
     * Алгоритм -> Пробегается по символам и запихивает обратный символ в stack.
     * Как только встречает обратный символ, сравнивает его с тем, который лежит в stack.
     */
    public static boolean isValid(String s) {
        if(s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == '(') {
                stack.push(')');
            } else if (character == '{') {
                stack.push('}');
            } else if (character == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != character ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
