package question;

import extraClass.ListNode;

public class No083 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null){
            return null;
        }
        ListNode h=head;
        ListNode n=h.next;
        
        while(n!=null && h!=null){
        	if(h.val==n.val){
        		h.next=n.next;
        		n=h.next;
        	}else{
        		h=n;
        		n=n.next;
        	}
        }
		
		return head;
    }
}
