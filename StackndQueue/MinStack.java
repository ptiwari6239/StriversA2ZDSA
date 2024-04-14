package StackndQueue;

import java.util.ArrayList;

public class MinStack {
    public static void main(String[] args){
    }
    static class minStack{
        private ArrayList<Integer> st ;
        private int top = -1;
        private ArrayList<Integer> arr ;
        private int min = Integer.MAX_VALUE;
        public minStack(){
            this.st = new ArrayList<>();
            this.arr = new ArrayList<>();
        }
        public void push(int val){
            top++;
            st.add(top,val);
            this.min = Math.min(min,val);
            arr.add(top,min);
        }
        public void pop(){
            top--;
        }
        public int top(){
            return st.get(top);
        }
        public int getMin(){
            return arr.get(top);
        }
    }

}

