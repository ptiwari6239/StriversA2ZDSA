// leetcode : 152
public class MaximumProductSubarray {
    public static void main(String[] args){
            int[] arr = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
            System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] nums){
        int max = Integer.MIN_VALUE;
        if(nums.length == 1)
            return nums[0];
        int pre = 1;
        int suf = 1;
        for(int i = 0 ; i < nums.length; i++ )
        {
            if(pre == 0)
                pre = 1;

            if(suf == 0)
                suf = 1;
            pre *=  (double)nums[i];
            suf *=  (double)nums[nums.length - i-1];
            max = Math.max(max, Math.max(pre, suf));
        }
    
        return max;

    }
}
