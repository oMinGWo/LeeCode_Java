package question;

import java.util.HashMap;

public class No141 {
	public boolean hasCycle(ListNode head) {
		HashMap<ListNode,Integer> h=new HashMap();
		ListNode p=head;
		while(p!=null){	
			if(h.containsKey(p)){
				return true;
			}else{
				h.put(p, 1);
				p=p.next;
			}
		}
		return false;
    }
}
