package String;

import java.util.HashMap;
import java.util.PriorityQueue;

// leetcode question:- 451
public class SortCharactersByFrequency {
    public static void main(String[] args){

    }
    static String frequency(String s){

        int n = s.length();
        HashMap<Character, Integer> hs = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for(int i=0;i<n;i++)
        {
            if(hs.containsKey(s.charAt(i)))
            {
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            }
            else{
                hs.put(s.charAt(i),1);
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hs.get(b) - hs.get(a)); // lambda expression for sorting based on frequence
        pq.addAll(hs.keySet());

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int value = hs.get(ch);

            for (int i = 0; i < value; i++) {
                str.append(ch);
            }
        }

        return str.toString();

    }

}
