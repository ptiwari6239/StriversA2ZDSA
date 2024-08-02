// leetcode :- 1833
public class MaximumIceCreamBars {
    public int intmax(int[] costs, int coins){
        int count = 0 ;
        for(int cost: costs){
            if(cost > coins)
                return count;
            else{
                count++;
                coins -= cost;
            }
        }
        return count;
    }
}
