// leetcode question:- 735

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

   public static  int[] asteroidCollision(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int a:arr){
            while(!st.empty() && a < 0 && st.peek() > 0){
                int sum = a + st.peek();
                if(sum < 0)
                    st.pop();
                else if(sum > 0 ){
                    a = 0;
                    break;
                }
                else{
                    st.pop();
                    a=0;
                }
    
            }
            if(a!=0)
                st.push(a);
        }
        int[] res = new int[st.size()];
        int i = st.size() - 1;

        while(!st.isEmpty()) {
            res[i--] = st.pop();
        }

        return res;
    }

}
