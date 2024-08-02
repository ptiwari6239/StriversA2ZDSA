// leetcode :- 2279

import java.util.Arrays;

public class MaximumBagsWithFullCapacityofRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n           = capacity.length;
        int[] remaining = new int[n];
        int count       = 0;

        for(int i = 0 ; i < n ; i++){
            remaining[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(remaining);

        for(int i = 0 ; i < n ; i++){
            if(additionalRocks >= remaining[i]){
                additionalRocks -= remaining[i];
                count++;
            }
            else{
                break;
            }

        }
        return count;
    }
}
