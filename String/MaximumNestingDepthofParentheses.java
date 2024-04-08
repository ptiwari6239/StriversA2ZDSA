package String;

import java.util.Deque;
import java.util.LinkedList;

// leetcode:- 1614
public class MaximumNestingDepthofParentheses {
    public static void main(String[] args){

    }
    static int maxDepth(String s){
        int max = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            if (s.charAt(i) == ')') {
                max = count;
                count--;
            }
        }

        return max;
    }
}
