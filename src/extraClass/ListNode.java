package extraClass;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public String toString(){
		ListNode h=this;
		if (h==null){
			return "";
		}
		StringBuilder sb=new StringBuilder();
		sb.append(h.val);
		while (h.next!=null){
			sb.append("->").append(h.next.val);
			h=h.next;
		}
		return sb.toString();
	}
}
