package String;
// leetcode question:- 242
public class ValidAnagram {
    public static void main(String[] args){
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
    static boolean isAnagram(String s , String t){
        if(s.length() != t.length())
                return false;
        int CHAR = 256;
        int count[] = new int[CHAR];
        for(int i = 0 ; i< s.length(); i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i = 0; i <  CHAR; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }

}
