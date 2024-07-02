class Check{
    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(check(nums));
    }
    static boolean check(int[] nums){
        int mis = 0 ;
        for(int i = 0 ; i < nums.length-1; i++){
            if(mis > 1 )
                return false;
            if(nums[i] > nums[i+1]){
                mis++;
            }
        }
        
        if(mis != 0 && nums[0] < nums[nums.length-1])
            return false;
            int miss = 0 ;
        for(int i = 0 ; i < nums.length -1 ; i++)
            {
                
                if(nums[i] > nums[i+1])
                    miss++;
            }
        if(miss > 1)
            return false;
        return true;
    } 
    
}