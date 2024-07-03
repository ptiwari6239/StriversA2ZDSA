// leetcode :- 540
public class SingleElement {
    public static void main(String[] args){
            int[] nums = {3};
            System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums){
        if(nums.length == 1)
            return nums[0];
        for(int i = 0 ; i < nums.length ; i+=2){
            if(i == nums.length -1)
                return nums[nums.length -1];
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return -1;
    }
}
