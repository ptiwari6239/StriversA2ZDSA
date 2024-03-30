public class FindPeakElement {
    // leetcode question 162
    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] nums){
        int low  = 0 ;
        int end = nums.length -1;
        while(low < end){
            int mid = low + (end - low)/2;

            if(nums[mid] < nums[mid+1])
                low = mid +1;
            else
                end  = mid;

        }

        return low;
    }
}
