package String;
// leetcode question:- 151
public class ReverseWordsinString {
    static String reverseWords(String s){
           String[] words = s.split("\\s+"); // this regex way will remove every no. of white space between two words
           int n = words.length -1 ;
           String ans = words[n];
           for(int i = n -1 ; i>= 0 ; i--){
               ans = ans.concat(" "+ words[i]);
           }
           ans = ans.trim(); // make sure to remove any white from starting and ending ..
        return ans;

    }
}
