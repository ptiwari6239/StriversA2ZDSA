public class SecondLargest {
    public static void main(String[] args){
        int[]  nums = {3,4,21,5,2,7};
        System.out.println(secondlarge(nums));
    }
    static int  answer(int[] nums){ // brute force
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > max)
                max = nums[i];
        }
        int semax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > semax && nums[i] < max)
                semax = nums[i];
        }
        

        return semax;

    }
    static int secondlarge(int[] nums){
     int seclarge = Integer.MIN_VALUE;
     int large = Integer.MIN_VALUE;
     for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > large){
                seclarge = large;
                large = nums[i];
            }
            else if (nums[i] > seclarge && nums[i] != large) {
                seclarge = nums[i];
            }
     }  
     
     return seclarge;
    }

}
