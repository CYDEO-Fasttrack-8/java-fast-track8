package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//{([])} // []() // {} // {([{])}
public class T13_ValidParenthesis {
    public static void main(String[] args) {
        //use map to hold valid pairs
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");

        Stack<Character> stack = new Stack<>();

        String str = "[]()";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            //check if currentChar is opening bracket

        }
    }
}
