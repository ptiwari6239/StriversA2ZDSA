// leetcode :- 621

import java.util.Arrays;

public class TaskScheduler {
       public int leastInterval(char[] tasks, int n) {
        int p = tasks.length;
        if(n == 0)
            return p;
        
        int[] counter = new int[26];
        for(char ch : tasks){
            counter[ch-'A']++;
        }
        Arrays.sort(counter);
        int chunks = counter[25] - 1;
        int idleSpots = chunks*n;

        for(int i = 24; i>=0; i--){
            idleSpots -= Math.min(chunks,counter[i]);
        }
        if(idleSpots > 0)
            return p + idleSpots;
        return p;
    }
}
