package BinarySearch;
// https://www.naukri.com/code360/problems/nth-root-of-m_1062679?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class FindNthRootOfM {
    public static void main(String[] args){

    }
    static int root(int n , int m ){
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high-low)/2;
            int res = check(n,m,mid);
            if(res == 1)
                return mid;
            if(res == 2)
                high = mid -1;
            else
                low = mid +1;

        }
        return -1;
    }
    static int check(int n,int m , int mid){
       long total = 1;
        for(int i = 1; i <= n; i++ )
        {
            if(total > m) // big test cases
                return 2;
            total *= mid;
        }
        if(total == m)
            return 1;
    return 0;
    }
}
