// leetcode :- 881
import java.util.*;
public class BoatstoSavePeople {
    public int boats(int[] people, int limit){
        int n = people.length;

        Arrays.sort(people);
        int i = 0,j = n-1;
        int boat = 0;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }
            else{
                j--;
            }
            boat++;
        }

        return boat;
    }
}
