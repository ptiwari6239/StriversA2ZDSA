// leetcode :- 930 
public class BinarySubarraysWithSum{
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr, 2));
    }
    static int numSubarraysWithSum(int[] nums, int goal){
        int total = 0;
        int left = 0, right = 0;
        int result = 0 ;
        int prefixzero = 0 ;
        while(right < nums.length){
            total += nums[right];
            while(left < right && (nums[left]==0 || total > goal)){
                if(nums[left]== 1)
                    prefixzero = 0;
                else
                    prefixzero +=1;
                total-=nums[left];
                left++;
            }
            if(total==goal)
                result += 1+ prefixzero;
            right++;
        }
        return result;
    }
}