import java.util.ArrayList;
import java.util.Collections;
// leetcode :- 148
public class SortList {
    
    public static void main(String[] args){
        // System.out.println("hello world");
        LL head = new LL(4);
        head.next = new LL(2);
        head.next.next = new LL(1);
        head.next.next.next = new LL(3);
        LL temp = sort(head);
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    public static LL sort(LL head){ // brute force (naive method)
        ArrayList<Integer> nums = new ArrayList<>();
        LL temp = head;
        while(temp != null){
            nums.add(temp.val);
            temp = temp.next;
        } 
        Collections.sort(nums);
        temp = head;
        int i = 0 ;
        while(temp != null){
            temp.val = nums.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

}
class LL{
    int val;
    LL next = null;
    LL (){}
    LL (int val){
        this.val = val;
    }
    LL(int val , LL next){
        this.val = val;
        this.next = next;
    }
}
