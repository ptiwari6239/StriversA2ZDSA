public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums){ // brute force
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            int sum = nums[i];
            if(sum > max)
                max = sum ;
            for(int j = i+1; j < nums.length; j++ ){
                if(sum + nums[j] > max){
                    sum += nums[j];
                    max = sum;
                }
                else{
                    sum +=  nums[j];
                }
            }
        }
        return max;
    }
    static int maxSum(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0 ;
        }
        return max;
    }
}
