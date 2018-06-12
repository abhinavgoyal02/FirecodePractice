package CircularLinkedLists;

public class DelTailNodeCircularLL {
	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static DelTailNodeCircularLL deleteTail;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = deleteTail.new ListNode(1);

		ListNode resultHead = deleteAtTail(inputHead);
		System.out.println("The result after deletion at the Tail = " + resultHead.data);
	}

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	// Solved on my own
	public static ListNode deleteAtTail(ListNode head) {
		if (head == null || head.next == head)
			return head;

		else {
			ListNode curr = head;
			ListNode prev = curr;
			while (curr.next != head) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = head;

			return head;
		}
	}
}
