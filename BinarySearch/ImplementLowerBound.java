public class ImplementLowerBound {
    public static void main(String[] args){

    }
    static int LowerBount(int[] arr, int x){
        int low = 0 ;
        int end = arr.length - 1;
        int ans = arr.length;
        while(low <= end){
            int mid = low + (end-low)/2;

            if(arr[mid] >= x){
                ans  = mid;
                    end = mid -1;
            }
            else
                low = mid +1;
        }
        return arr.length ;



    }
}
