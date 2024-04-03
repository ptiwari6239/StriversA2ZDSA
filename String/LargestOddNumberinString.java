// leetcode question:- 1903
package String;
public class LargestOddNumberinString {
    static String LargestOdd(String num){
        int n = num.length() ;
        for(int i = n-1 ; i >=0; i--){
            char a = num.charAt(i);
            if(a == '1' || a=='3'|| a=='5'||a=='7'||a=='9')
                return num.substring(0,i+1);
        }
        return "";
    }
}
