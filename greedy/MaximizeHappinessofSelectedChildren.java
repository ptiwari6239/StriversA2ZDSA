// leetcode :- 3075

import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
        public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        revArr(happiness);

        long result = 0;
        for(int i = 0 ; i < k; i++){
            result = result + Math.max(happiness[i]-i,0);
        }

        return result;

    }
    public void revArr(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
            i++;
            j--;
        }
    }
}
