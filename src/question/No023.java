package question;

/*
 * Not finished
 */

import extraClass.ListNode;

public class No023 {

	public static void main(String args[]) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(5);
		a1.next = a2;
		ListNode b1 = new ListNode(2);
		ListNode b2 = new ListNode(4);
		b1.next = b2;
		ListNode[] ll={a1,b1};
		No023 n=new No023();
		n.mergeKLists(ll);
	}
	
	

	public ListNode mergeKLists(ListNode[] lists) {
		/*boolean done = true;
		for (ListNode i : lists) {
			if (i != null) {
				done = false;
				break;
			}
		}
		if (done) {
			return null;
		}
		ListNode result = new ListNode(0);
		int min = Integer.MAX_VALUE;
		for (ListNode i : lists) {
			if (i != null && i.val < min) {
				min = i.val;
			}
		}
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null && lists[i].val == min) {
				lists[i] = lists[i].next;
				break;
			}
		}
		result.val = min;
		result.next = mergeKLists(lists);

		return result;*/
		
		
		if( lists.length <= 0 ){  
            return null;  
        }  
        //k��¼ÿ���γɵ�ListNode[]�ĳ���  
        int k , i;  
        int length = lists.length;  
        do{  
            k = 0;  
            for( i = 0; i < length && i+1 < length; i += 2 ){  
                lists[k++] = mergeTwoLists( lists[i], lists[i+1] );  
            }  
            //�����ż����������ListNode[]�����������Ϊ������ʱ��  
            //��Ϊǰ���ǰ���������������Ƚϣ����Խ����һ��ֱ�Ӽӵ�  
            //��������  
            if( i == length-1 ){  
                lists[k++] = lists[length - 1];  
            }  
            length = k;  
        }while( k > 1 );  
        //����ǰ�� k++ ��������k ʼ�տ�ǰһ�������Ե���������  
        //����ֻʣһ����ʱ��kָ���±�1  
          
        return lists[0];  
	}
	public ListNode mergeTwoLists( ListNode l1, ListNode l2 ) {  
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






















