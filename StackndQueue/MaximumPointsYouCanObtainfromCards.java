// leetcode question:- 1423
public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args){
    }
    static int maxScore(int[] cardPoints, int k){
        int lsum = 0;
        int rsum = 0;
        int max = 0;
        int n = cardPoints.length;
            for(int i = 0; i < k ; i++)
                {
                    lsum += cardPoints[i];
                }
                 max = lsum;
        int rinx = n-1;
            for(int i = k-1; i>=0; i-- ){
                lsum = lsum - cardPoints[i];
                rsum = rsum + cardPoints[rinx];
                rinx--;
                max = Math.max(max, lsum+rsum);
            }

        return max;
    }


}
