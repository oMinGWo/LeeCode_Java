package question;

import extraClass.ListNode;

public class No019 {
	
	public static void main(String args[]) {
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		x1.next = x2;
		x2.next = x3;
		No019 n=new No019();
		ListNode h=n.removeNthFromEnd(x1,2);
		System.out.println(h.next.val);
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode h=new ListNode(0);
		h.next=head;
		ListNode fast=head;
		ListNode slow=head;
		for(int i=0;i<n;i++){
			if(fast.next==null){
				return head.next;
			}
			fast=fast.next;
		}
		
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		
		slow.next=slow.next.next;
		return h.next;
    }
}
