// leetcode : - 948

import java.util.Arrays;

public class BagofTokens{
   public int bag(int[] tokens, int power){
    int n = tokens.length;
    Arrays.sort(tokens);

    int currscore = 0;
    int maxscore  = 0;

    int l = 0;
    int r = n-1;
    while(l <= r){
        if(power >= tokens[l]){
            power-=tokens[l];
            currscore++;
            maxscore = Math.max(maxscore, currscore);
            l++;
        }
        else if(currscore >= 1){
            currscore--;
            power += tokens[r];
            r--;
        }
        else{
            return maxscore;
        }
    }
    return maxscore;
   }
}