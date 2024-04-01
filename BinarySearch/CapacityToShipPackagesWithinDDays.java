package BinarySearch;
// leetcode question:- 1011
public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(possible(array,15,5));
    }
    static int possible(int[] nums,int weight,int day){
        int sum  = 0 ;
        int totalday = 1 ;
        for(int i = 0 ; i< nums.length; i++){
            if(sum+nums[i] > weight){
                totalday +=1;
                sum = nums[i];
            }
            else{
                sum +=nums[i];
            }
        }
        return totalday ;
    }
}
