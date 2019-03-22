package question;

import extraClass.ListNode;

public class No082 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode y=new ListNode(-1);
        y.next=head;
        ListNode prev=y;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val != curr.val){
                prev=curr;
                curr=curr.next;
            }else {
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                curr=curr.next;
                prev.next=curr;
            }
        }
        return y.next;
    }
}
