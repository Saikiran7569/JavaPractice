package DS;

import java.util.List;

public class LinkedListOddEven {

	public static void main(String[] args) {
	ListNode input = new ListNode(1); 	
	ListNode output = 	oddEvenList(input);
	ListNode nthListNode = removeNthNode(input,2);

	}

	private static ListNode removeNthNode(ListNode input, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next= input;
		
		ListNode slow = dummy;
		ListNode fast = dummy;
		
		for (int i = 1; i <= n+1; i++) {
			fast = fast.next;			
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
			
		return dummy.next;
	}

	private static ListNode oddEvenList(ListNode input) {
		if(input == null) {
			return null;
		}
		ListNode odd = input;
		ListNode even = input.next;
		ListNode evenhead = even;
		
		while(even !=null && even.next != null) {
			odd.next=even.next;
			odd = odd.next;
			odd.next=odd.next;
			even =  even.next;
		}
		odd.next= evenhead;
		return input;
	}

}

class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int x) {
		val=x;
	}
}
