package question;

import extraClass.ListNode;

public class No002 {
	public static void main(String args[]) {
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(1);
		ListNode x3 = new ListNode(1);
		x1.next = x2;
		x2.next = x3;

		ListNode y1 = new ListNode(1);
		ListNode y2 = new ListNode(1);
		ListNode y3 = new ListNode(1);
		y1.next = y2;
		y2.next = y3;
		No002 n = new No002();
		n.addTwoNumbers(x1, y2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		int value = 0;
		ListNode n1 = l1;
		ListNode n2 = l2;
		ListNode result = null;
		ListNode resultItr = null;

		while (n1 != null && n2 != null) {
			value = n1.val + n2.val + carry;
			carry = value / 10;
			value = value % 10;
			ListNode tem = new ListNode(value);
			if (result == null) {
				result = tem;
			}
			if (resultItr != null) {
				resultItr.next = tem;
			}
			resultItr = tem;
			n1 = n1.next;
			n2 = n2.next;
		}

		while (n1 != null) {
			value = n1.val + carry;
			carry = value / 10;
			value = value % 10;
			ListNode tem = new ListNode(value);
			if (result == null) {
				result = tem;
			}
			if (resultItr != null) {
				resultItr.next = tem;
			}
			resultItr = tem;
			n1 = n1.next;
		}

		while (n2 != null) {
			value = n2.val + carry;
			carry = value / 10;
			value = value % 10;
			ListNode tem = new ListNode(value);
			if (result == null) {
				result = tem;
			}
			if (resultItr != null) {
				resultItr.next = tem;
			}
			resultItr = tem;
			n2 = n2.next;
		}
		if (carry != 0) {
			ListNode t = new ListNode(carry);
			if (resultItr != null) {
				resultItr.next = t;
			}
		}
		return result;
	}
}
