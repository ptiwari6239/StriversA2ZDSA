// leetcode question:- 796
package String;
public class RotateString {
    public static void main(String[] args){
        String s = "gwhqmrxpuppvuiuzicencvgtuzuxkhdqcwdbiciliiapdbzocr";
//        s = s+s;
        String b = "dsinzpskimfgcppsvjbhasfvqszngdhqtakrlxdmeeqakfxucy";
        System.out.println(rotateString(s,b));
//        rotateString(s,b);
    }
    static boolean rotateString(String s , String goal){

        if(s.length() != goal.length())
                return false;
        s = s+s;
        return s.contains(goal);
    }

}
