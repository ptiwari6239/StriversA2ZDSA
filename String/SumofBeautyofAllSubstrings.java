package String;

import java.util.Arrays;

// leetcode :- 1781
public class SumofBeautyofAllSubstrings {
    public static void main(String[] args){
        System.out.println(beautySum("aabcbaa"));
    }
    static int beautySum(String s){
        int CHAR  = 26;
        int sum = 0;
        int hash[] = new int[CHAR];
        for(int i = 0 ; i < s.length(); i++){
                for(int j = i ; j < s.length(); j++){
                    hash[s.charAt(j)-'a']++;
                    int beaty = getMaxCount(hash) - getMinCount(hash);
                    sum+=beaty;
                }
        }
        return sum;
    }
    static int getMaxCount(int[] charCount) {
        int max = 0;

        for (int i = 0; i < charCount.length; ++i) {
            max = Math.max(max, charCount[i]);
        }

        return max;
    }
    static int getMinCount(int[] charCount) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < charCount.length; ++i) {
            if (charCount[i] != 0) {
                min = Math.min(min, charCount[i]);
            }
        }

        return min;
    }

}
