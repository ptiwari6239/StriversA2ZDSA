// leetcode :- 1653

import java.util.Stack;

public class MinimumDeletionstoMakeStringBalanced {
        public int minimumDeletions(String s) {
        int count = 0 ;
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            if(!st.isEmpty() && s.charAt(i) == 'a' && st.peek() == 'b'){
                st.pop();
                count++;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return count;
    }
}
