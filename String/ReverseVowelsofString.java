// leetcode :- 345
public class ReverseVowelsofString{
    public static boolean vowel(char ch){
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' ||   ch == 'O' || ch == 'u' || ch == 'U';
    }
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray(); 
        int left   = 0;
        int  right = str.length -1;
        while(left < right){
            if(!vowel(str[left])) 
                left++;
            else if (!vowel(str[right]))
                right--;
            else{
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
          

        } 
        return new String(str);
    }
}