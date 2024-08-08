// leetcodes :- 258
public class AddDigits {
    public int addDigits(int num) {
        int value = num;
        while(value > 9){
            int newVal = 0;
            int rem    = 0;
            while(value != 0){
                rem      = value%10;
                newVal   = newVal + rem;
                value    = value/10;
            }
            value = newVal;

        }
        return value;
    }
}
