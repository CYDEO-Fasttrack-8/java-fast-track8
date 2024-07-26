package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//{([])} // []() // {} // {([{])}
public class T13_ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[]()"));
        System.out.println(isValid("[)"));
    }
    public static boolean isValid(String str) {
        //use map to hold valid pairs
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            //check if currentChar is opening bracket
            if (map.containsKey(currentChar)) {
                stack.push(currentChar); //{([
            } else {//closing bracket      )               ]      [
                if (stack.isEmpty() || currentChar != map.get(stack.pop())) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
