package String;
// leetcode :- 1021
public class RemoveOutermostParentheses {
    public static void main(String[] args){
            String s = "(())";
        System.out.println(remove(s));
    }
    static String remove(String s){
        StringBuilder ans = new StringBuilder();
        int open = 0 ;
        char[] c = s.toCharArray();
        int len = c.length;
        for(int i = 0 ; i < len; i++){
                if(c[i] == '('){
                    if(open!=0)
                            ans.append(c[i]);
                    open++;
                }else{
                    open--;
                    if(open != 0 )
                        ans.append(c[i]);
                }
        }

        return ans.toString();
    }
}
