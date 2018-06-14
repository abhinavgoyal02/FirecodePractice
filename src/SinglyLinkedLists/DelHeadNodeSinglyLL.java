package SinglyLinkedLists;

public class DelHeadNodeSinglyLL {

	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static DelHeadNodeSinglyLL deleteHead;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = deleteHead.new ListNode(1);

		ListNode resultHead = deleteAtHead(inputHead);
		System.out.println("The result after deletion at the Tail = " + resultHead);
	}

	// This Linked List program works in Firecode!
	public static ListNode deleteAtHead(ListNode head) {
		ListNode curr;
		if (head == null || head.next == null)
			return head = null;

		else {
			curr = head.next;
			head.next = null;
		}
		return curr;
	}
}
