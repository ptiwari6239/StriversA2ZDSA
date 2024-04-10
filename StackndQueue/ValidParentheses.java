package StackndQueue;

import java.util.Stack;

// leetcode:- 20
public class ValidParentheses {
    public static void main(String[] args){
    String s = "(]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){

        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch=='[' || ch == '{')
                st.push(ch);
            if(ch==')' || ch==']' || ch=='}')
            {   if(st.isEmpty())
                    return false;
                if(ch==')' && st.peek() != '(')
                    return false;
                if(ch=='}' && st.peek() != '{')
                    return false;
                if(ch==']' && st.peek() != '[')
                    return false;

                st.pop();
            }
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}
