package question;

import extraClass.ListNode;

public class No328 {
    //根据位置 奇偶分隔链表
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode firstEven=head.next;
        boolean lastEven=true;
        ListNode pp=null;
        while(curr!=null){
            lastEven = !lastEven;
            pp = prev;
            prev=curr;
            curr=curr.next;
            if(curr!=null){
                prev.next=curr.next;
            }
        }
        if(firstEven!=null){
            if(!lastEven){
                prev.next=firstEven;
            }else {
                pp.next=firstEven;
            }
        }
        return head;
    }
}
