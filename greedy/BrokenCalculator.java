// leetcode :- 991
public class BrokenCalculator {
    public int brokenCal(int startValue, int target){
        if(startValue >= target)
            return startValue-target;
        
        if(target%2==0)
            return 1+brokenCal(startValue, target/2);
        
        return 1+brokenCal(startValue, target+1);
    }
}
