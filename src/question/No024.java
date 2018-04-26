package question;

import extraClass.ListNode;

public class No024 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p1=head;
		ListNode p2=head.next;
		ListNode p3=p2.next;
		
		head=p2;
		while(true){
			p2.next=p1;
			if(p3==null || p3.next==null){
				p1.next=p3;
				break;
			}else{
				p1.next=p3.next;
			}
			p1=p3;
			p2=p3.next;
			p3=p2.next;
		}
		return head;
	}
}
