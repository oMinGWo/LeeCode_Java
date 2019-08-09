package question;

import extraClass.ListNode;

import java.util.PriorityQueue;
import java.util.Stack;

public class No234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode h = head;
        while(h!=null){
            stack1.push(h.val);
            h=h.next;
        }
        int length = stack1.size();
        for (int i=0;i<length/2;++i){
            int x = stack1.pop();
            stack2.push(x);
        }
        if (length % 2 ==1){
            stack1.pop();
        }
        if (stack1.size() == stack2.size()){
            while(!stack1.empty() && !stack2.isEmpty()){
                int x = stack1.pop();
                int y = stack2.pop();
                if (x!=y){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
