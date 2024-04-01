package BinarySearch;
// leetcode question 875;
// piles = [3,6,7,11], h = 8
//k = 1 to 11 bananas per hours
//
//k = 1,
//3/1 + 6/1 + 7/1 + 11/1 = 3 + 6 + 7 + 11 = 27hrs > 8 hrs = Not enough time
//
//k = 2,
//3/2 + 6/2 + 7/2 + 11/2 = 2 + 3 + 4 + 6 = 15 hrs > 8 hrs = Not enough time
//
//k = 3,
//3/3 + 6/3 + 7/3 + 11/3 = 1+ 2+ 3 + 4 = 10hrs > 8 hrs = Not enough time
//
//k = 4,
//3/4 + 6/4 + 7/4 + 11/4 = 1 + 2 + 2 + 3 = 8hrs = GOOD
//
//k = 5,
//3/5 + 6/5 + 7/5 + 11/5 = 1 + 2 + 2 + 3 = 8hrs = GOOD, but not the minimum k
//
//k = 6,
//3/6 + 6/6 + 7/6 + 11/6 = 1 + 1 + 2 + 2 = 4hrs = GOOD, but not the minimum k
//.
//.
//.
//So the answer is k=4 .
public class KokoEatingBananas {
    public static void main(String[] args){
        System.out.println(Math.ceil((double)(10) / (double)(3)));
    }
    // find how much time it takes to eat all banana if the speed of eating banana is "rate"
    public static int totalHour(int[] nums,int rate){
        int hour = 0;
        for(int i = 0 ; i < nums.length; i++){
            hour+=Math.ceil((double)(nums[i]) / (double)(rate));
        }
        return hour;
    }

    public static int rateOfEating(int[] nums, int h){
        int maxi = Integer.MIN_VALUE; // max of array will be the end bound of binarysearch
        // since it pinishe all banana in that rate
        for(int i = 0; i< nums.length; i++){
            maxi = Math.max(maxi,nums[i]);
        }
        int low = 1;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low)/2;
            int totalh = totalHour(nums,mid);
            if(totalh <= h) // checks if koko can eat all banana in "mid" rate and if its minimum
                high = mid -1;
            else
                    low = mid +1;
        }
        return low;
    }
}
