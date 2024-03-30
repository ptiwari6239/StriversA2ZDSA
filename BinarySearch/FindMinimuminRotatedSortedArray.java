package BinarySearch;
    // leetcode question:- 153
public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {3,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums){
        int low = 0;
        int end = nums.length -1;
        while(low < end){
            int mid = low + (end-low)/2;
            if(nums[low] > nums[end])
                low = mid;
            else
                end = mid-1;

        }
        return low;

    }
}
