// leetcode :- 2485
public class FindthePivotInteger {
    public int pivotInteger(int n){
        if(n == 1)
            return n;
        int totalsum =  n*(n+1)/2;
        
        for(int i = 1 ; i <= n; i++){
            int leftsum  = i*(i+1)/2;
            int rightsum = totalsum - leftsum +i ;
            if(leftsum == rightsum)
                return i; 
        }
        return -1;
    }
    
}
