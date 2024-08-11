// leetcode :- 1716

public class CalculateMoneyinLeetcodeBank {
    public int totalMoney(int n) {
        int result = 0;
        int monday = 1;

        while(n > 0){
            int money = monday;
            for(int i = 0; i < Math.min(7,n); i++){
                result += money;
                money++;
            }
            n -= 7;
            monday++;
        }
        return result;
    }
    public int Money(int n) {
        int terms  = n/7;
        int first  = 28;
        int last   = 28 + (terms -1) * 7;

        int result = terms * (first+last)/2;
        int start_money = 1 + terms;
        for(int i = 0 ; i < n%7 ; i++){
            result += start_money;
            start_money++;
        } 
        return result;
    }
    
}
