package dowlath.io.dsa.leetcode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
       // String s = "()[]{}";
        String s = "(}";
        System.out.println("Is valid parenthesis .... : " + validParenthesis(s));
    }
   private static boolean validParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            if( c == '(' || c== '[' || c == '{'){
                stack.push(c);
            } else if (c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }else if (c == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
            }else if (c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
   }
}
