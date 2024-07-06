// leetcode 118
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args){

    }
    public static List<Integer> Rows(int row){
      List<Integer> result = new ArrayList<>();
        result.add(1);
        long ans = 1 ;
        for(int i = 1; i < row;i++){
            ans *= (row-i);
            ans /= i;
            result.add((int)ans);
        }
      return result;
    }
    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= numRows; row++ ){
                ans.add(Rows(row));
        }
        return ans;
    } 
}
