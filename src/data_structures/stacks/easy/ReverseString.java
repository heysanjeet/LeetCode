package data_structures.stacks.easy;

import java.util.Stack;

public class ReverseString {
    //Native
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    //Batter approach using stack
    public static String reverseString2(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            result = result + stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello";
        String result = reverseString2(str);
        System.out.println(result);
    }
}
