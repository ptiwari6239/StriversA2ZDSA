// leetcode :- 2870

import java.util.Arrays;

public class NumberofOperationstoMakeArrayEmpty {
    public int minOperations(int[] nums) {
        if(nums.length == 0)
            return -1;

        Arrays.sort(nums);
        int result = 0;
        int i = 0;
        while(i < nums.length){
            int count = 1;
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                count++;
                i++;
            }
            if(count < 2)
                return -1;
            if(count % 3 == 0)
                result += count/3;
            else{
                result += count/3+1;
            }
            
            i++;
        }
        return result;
    }
}
