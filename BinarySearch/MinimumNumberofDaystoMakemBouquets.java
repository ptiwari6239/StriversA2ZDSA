package BinarySearch;

// leetcode question:- 1482
public class MinimumNumberofDaystoMakemBouquets {
    // checking if  all Bouquets can be made on "day" day
    public static boolean possible(int[] arr, int day, int m , int k ){
        int cnt = 0 ;
        int noOfB = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= day)
                cnt++; // only if the required flowers are in continues manner
            else{
                noOfB += (cnt/k);
                cnt = 0;
            }

        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
    public static int minDays(int[] nums, int m , int k ){
        long val = (long) m*k;
        if(val > nums.length)
            return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            mini = Math.min(nums[i],mini);
            maxi = Math.max(nums[i],maxi);
        }
        int low = mini; // minimun days is equal to mini number in array as it is least day on which any flower will bloom
        int high = maxi; // all flower will be bloom on that day
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(nums,mid,m,k)) // if true then
                high = mid -1; // it means other can be other days less then day on which  all  Bouquets can be made
            else
                low = mid +1;
        }
        return low;
    }

}
