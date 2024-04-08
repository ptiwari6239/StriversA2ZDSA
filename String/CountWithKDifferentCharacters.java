package String;

import java.util.Arrays;

// https://www.naukri.com/code360/problems/count-with-k-different-characters_1214627?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class CountWithKDifferentCharacters {
    public static void main(String[] args){

    }
    static int countSubstring(String str, int k){
        int n = str.length() ;
        int res = 0 ;
        boolean seen[]  = new boolean[26];
        for(int i = 0 ; i < n; i++){
            int dist = 0 ;
            Arrays.fill(seen,false);
            for(int j = i; j < n; j++){
                if(!seen[str.charAt(j)-'a'])
                    dist++;
                seen[str.charAt(j)-'a'] = true;
                if(dist == k)
                    res++;
            }
        }
        return  res;
    }
}
