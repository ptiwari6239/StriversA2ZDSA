// leetcode :- 342
public class PowerofFour {
    public boolean isPowerOfFour(int n) {

        if(n<=0)
           return false;
        int a = (int)(Math.log(n)/Math.log(4));
        return n == Math.pow(4,a);
        
       }
}
