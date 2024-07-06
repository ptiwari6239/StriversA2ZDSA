// leetcode :- 2582
public class PassthePillow {
    public static void main(String[] args){
        System.out.println(pass(3,1));
    }
    public static int pass(int n, int time){
        int index = 1;
        int dir = 1;

        for(int t = time; t > 0 ; t--){
            if(index == n)
                dir = -1;
            if(index == 1)
                dir = 1;
            index +=dir;
        }
        return index;
    }
}
