// leetcode :- 1921

import java.util.Arrays;

public class EliminateMaximumNumberofMonsters {
    public int eliminateMaximum(int[] dist, int[] speed) {
            int n = dist.length;
            int time_pass = 1;
            int[] time = new int[n];

            for(int i = 0 ; i< n ; i++){
                time[i] = (int)Math.ceil((double)dist[i]/speed[i]);
            }   

            Arrays.sort(time);

            int count = 1;

            for(int i = 1; i < n; i++){
                if(time[i]-time_pass <= 0)
                    return count;
                time_pass++;
                count++;
            }
            return count;
    }
    
}
