// leetcode :- 1647

import java.util.Arrays;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int result = 0;

        for(int i = 0 ; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        for(int i = 24; i >= 0 ; i--){
            if(freq[i] >= freq[i+1]){
                
                int prev = freq[i];
                freq[i] = Math.max(0,freq[i+1]-1);
                result += (prev - freq[i]);
            }
        }
        return result;
    }
}
