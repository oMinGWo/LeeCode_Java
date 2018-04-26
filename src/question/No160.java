package question;

import extraClass.ListNode;

public class No160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) return null;
        ListNode h1=headA;
        ListNode h2=headB;
        int count1=1;
        int count2=1;
        while(h1.next!=null){
        	count1++;
        	h1=h1.next;
        }
        while(h2.next!=null){
        	count2++;
        	h2=h2.next;
        }
        if(h1!=h2) return null;
        int minus=Math.abs(count1-count2);
        if(count1>count2){
        	h1=headA;
        	h2=headB;
        }else{
        	h1=headB;
        	h2=headA;
        }
        while(minus>0){
        	minus--;
        	h1=h1.next;
        }
        while(h1!=null&&h2!=null&&h1!=h2){
        	h1=h1.next;
        	h2=h2.next;
        }
		return h1;
    }
}
