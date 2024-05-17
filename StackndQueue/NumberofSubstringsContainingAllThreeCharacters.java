public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args){
        String s = "ab";
        System.out.println(numberOfSubstrings(s));
    }
    static int numberOfSubstrings(String s){
            int result =  0;
            int left = 0 , right = 0 ;
            int n =  s.length();
            int[] hash = new int[3];
            while(right < n){
                hash[s.charAt(right)-97]++;

                while(left < right && Notempty(hash) == true)
                   {
                    result +=1+(n-(right+1));
                    hash[s.charAt(left)-97]--;
                    left++;

                } 
                right++;
            }

            return result;
    }
    static boolean Notempty(int[] hash){
        for(int i = 0 ; i < hash.length; i++){
            if(hash[i] == 0)
                return false;
        }

        return true;
    }
}
