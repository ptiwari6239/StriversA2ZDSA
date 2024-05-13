package StackndQueue;

import java.util.Stack;

// leetcode :- 907
public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length ;
        int[] nsl = getNRL(arr, n);
        int[] nrl = getNRL(arr, n);
        long sum = 0 ;
        int M = 1000000007;
        for(int i = 0 ; i < n; i++){
            long d1 = i - nsl[i];
            long d2 = nrl[i] - i;
            long totalway = d1*d2;
            long sumintotal = arr[i] * totalway;
            sum = (sum + sumintotal) % M;
        }
        return (int) sum;
    }
    
    int[] getNSL(int[] arr,int n){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        return result;
    }
    int[] getNRL(int[] arr, int n){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0 ; i--){
               while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                    st.pop();
                
                result[i] = st.isEmpty() ? n: st.peek();
                st.push(i);
        }
        return result;
    }

}
