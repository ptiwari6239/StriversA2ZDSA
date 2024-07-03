import java.util.Arrays;

public class LeadersinanArrayproblem {
    public static void main(String[] args){
        int[] arr = {400};
        System.out.println(Arrays.toString(replaceElement(arr)));
    }
    static int[] replaceElement(int[] arr){
        if(arr.length == 1)
        {
            arr[0]  = -1;
            return arr;
        }
        int max = arr[arr.length -1];
        arr[arr.length -1] = -1;
        for(int i = arr.length - 2  ; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }

        return arr;
    }
}
