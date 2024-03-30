package BinarySearch;

public class FindtheSmallestDivisorGivenThreshold {
    public static void main(String[] args){

    }
   public static int findSum(int[] num,int d){
        int sum = 0;
        for(int i = 0 ; i < num.length; i++){
            sum += Math.ceil((double)(num[i]) / (double)(d));
        }
        return sum;
    }
    public static int smallest(int[] arr,int limit){
        int n = arr.length; //size of array.
        if(n > limit) return -1;
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int low = 1;
        int high = maxi;
        while(low<=high){
            int mid = (low + high) / 2;
            if (findSum(arr, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
