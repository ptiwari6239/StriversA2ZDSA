public class CountNumberofNiceSubarrays {
    public static void main(String[] args){
        int[] arr = {1,1,2,1,1};
        System.out.println(numberOfSubarrays(arr, 2));
    }
    static int numberOfSubarrays(int[] nums, int k){
        int result = 0 ;
        int left = 0 ;
        int right = 0;
        int prefixzero = 0 ;
        int windowsum = 0;
        while(right < nums.length){
            if(nums[right] %2 == 0 )
                nums[right] = 0;
            else
                nums[right] = 1;
            windowsum += nums[right];
            while(left < right && (nums[left]==0 || windowsum > k)){
                    if(nums[left]==1)
                            prefixzero = 0;
                        else
                            prefixzero+=1;
                        windowsum = windowsum - nums[left];
                        left++;
                    }
                    if(windowsum == k){
                        result += 1+ prefixzero;
                    }
                    right++;
                }
                return result;
    }
    
       
 
}
