package question;

public class No021 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
        	return l2;
        }
        if(l2==null){
        	return l1;
        }
        ListNode n1=l1;
        ListNode n2=l2;
        ListNode head=new ListNode(0);
        ListNode h=head;
        
        while(n1!=null && n2!=null){
        	if(n1.val<n2.val){
        		head.next=n1;
        		head=head.next;
        		n1=n1.next;
        	}else{
        		head.next=n2;
        		head=head.next;
        		n2=n2.next;
        	}
        }
        
        while(n1!=null){
        	head.next=n1;
    		head=head.next;
    		n1=n1.next;
        }
        while(n2!=null){
        	head.next=n2;
    		head=head.next;
    		n2=n2.next;
        }
        
		return h.next;
    }
}
