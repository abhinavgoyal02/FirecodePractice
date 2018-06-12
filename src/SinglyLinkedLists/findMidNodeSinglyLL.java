package SinglyLinkedLists;

public class findMidNodeSinglyLL {
	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}
	
	public static findMidNodeSinglyLL findMiddle;
	
	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = findMiddle.new ListNode(1);

		ListNode resultHead = findMiddleNode(inputHead);
		System.out.println("The result after deletion at the Tail = " + resultHead.data);
	}
	
	//Own solved - Working solution
	public static ListNode findMiddleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		if (head == null)
			return head = null;
		
		else if (head.next == null)
			return head;
		
		else {
			while (fast!=null && fast.next!=null && (fast.next).next!=null) {
				slow = slow.next;
				fast = (fast.next).next;
			}
			return slow;
		}
	}

}
