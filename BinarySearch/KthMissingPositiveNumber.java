package BinarySearch;
// leetcode :- 1539
 class KthMissingPositiveNumber {
    public static void main(String[] args){


    }
     static  int findNumber(int[] arr, int k ){
        int low = 0 ;
        int high = arr.length -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int mis = arr[mid] - (mid+1);
            if(mis >= k)
                high = mid -1;
            else
                low = mid +1;
        }
        return high + k +1;

    }

}
