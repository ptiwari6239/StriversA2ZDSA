package BinarySearch;
// leetcode question:- 410
public class SplitArrayLargestSum {
    public static int subarray(int[] nums,int sum ){
        int totalsum = 0;
        int totalarrays = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(totalsum + nums[i] <= sum){
                totalsum += nums[i];
            }
            else{
                totalarrays++;
                totalsum = nums[i];
            }
        }
        return totalarrays;
    }
    public static int splitArray(int[] nums,int k){
      int low = nums[0];
      int high = 0;
      for(int i = 0 ; i< nums.length ; i++){
          low = Math.max(nums[i],low);
          high +=nums[i];
      }
      while(low <= high){
          int mid = low + (high - low)/2;
          int subarr = subarray(nums,mid);
          if(subarr > k)
              low = mid +1;
          else
              high = mid -1;
      }
      return low;

    }
}
