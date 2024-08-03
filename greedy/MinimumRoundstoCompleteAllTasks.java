// leetcode :- 2244
import java.util.*;
public class MinimumRoundstoCompleteAllTasks {
    public int minimunRound(int[] tasks){
        int n      = tasks.length;
        int rounds = 0;
        int count  = 1;
        Arrays.sort(tasks);
    
        for(int i = 1 ; i < n; i++){
            if(tasks[i] == tasks[i-1]){
                count++;
            }
            else{
                if(count < 2)
                    return -1;
                else if(count % 3 == 0)
                    rounds += count / 3; 
                else{
                    rounds += count /3 +1;
                }
                count = 1 ;
            }

        }


        return rounds;
    }
}
