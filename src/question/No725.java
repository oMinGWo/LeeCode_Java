package question;

import extraClass.ListNode;

public class No725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] re=new ListNode[k];
        if(root==null){
            return re;
        }
        int len=1;
        ListNode t=root;
        while(t.next!=null){
            len++;
            t=t.next;
        }
        int base = len / k;
        int more = len % k;
        ListNode h=root;
        for(int i=0;i<k;++i){
            re[i] = root;
            int moreOne = 0;
            if(more>0){
                moreOne=1;
                more--;
            }
            int pos=0;
            while(pos<base+moreOne && root!=null){
                pos++;
                if(pos==base+moreOne){
                    ListNode temp=root.next;
                    root.next=null;
                    root=temp;
                    break;
                }
                root=root.next;
            }
        }
        return re;
    }
}
