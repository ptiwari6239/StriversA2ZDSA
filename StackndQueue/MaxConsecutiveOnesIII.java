// leetcode :- 1004
public class MaxConsecutiveOnesIII {
    public static void main(String[] args){
            int[] arr = {0,0,0,1};
            System.out.println(longestOnes(arr, 4));
    }
    static int longestOnes(int[] nums, int k){
        int len = 0;
        int z = k;
        int i = 0 , j = 0 ;
        while(j < nums.length){
            if(nums[j]==1 || z >0){
                if(nums[j] == 0)
                    z--;
                len = Math.max(j-i+1,len);
                j++;
            }
            else{     
           
                len = Math.max(j-i,len);
                if(nums[i] == 0)
                    z++;
                i++;
            }
        }
        return len;
    }
}
