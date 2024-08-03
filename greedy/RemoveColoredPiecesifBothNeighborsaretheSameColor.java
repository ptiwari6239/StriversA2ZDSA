// leetcode : - 2038

public class RemoveColoredPiecesifBothNeighborsaretheSameColor{
    public boolean winner(String colors){

        int n     = colors.length();
        int alice = 0;
        int bob   = 0;

        for(int i = 1 ;  i < n-1; i++){

            if(colors.charAt(i-1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i+1)){

                if(colors.charAt(i) == 'A')
                    alice++;
                else    
                    bob++;

            }
        }
        

        if(alice > bob)
            return true;
        return false;
    }
}