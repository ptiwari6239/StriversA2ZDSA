public class Numberofoccurrence {
    // question https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3};
        System.out.println(count(arr,4));
    }
    static int count(int arr[],int x){
        int low = 0 ;
        int end = arr.length -1;
        int count  =0 ;
        while(low <= end){
            int mid = low + (end-low)/2;
            if(arr[mid] == x){
                count++;
                low =  mid-1;
                end = mid +1;
                while(low >= 0){
                    if(arr[low] == arr[mid]){
                        count++;
                        low--;
                    }
                    else
                        break;
                }
                while(end < arr.length ){
                    if(arr[end] == arr[mid]){
                        count++;
                        end++;
                    }
                    else
                        break;
                }
                break;
            }
            if(arr[mid] > x)
                end = mid -1;
            else
                low = mid + 1;
        }

        return count;
    }

}
