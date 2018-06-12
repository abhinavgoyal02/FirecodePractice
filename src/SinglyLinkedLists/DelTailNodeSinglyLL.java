package SinglyLinkedLists;

public class DelTailNodeSinglyLL {

	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static DelTailNodeSinglyLL deleteTail;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = deleteTail.new ListNode(1);

		ListNode resultHead = deleteAtTail(inputHead);
		System.out.println("The result after deletion at the Tail = " + resultHead.data);
	}
	
	//Working Solution copied from Firecode
	public static ListNode deleteAtTail(ListNode head) {
		ListNode curr = head;
		ListNode prev = curr;
		if (head == null || head.next == null)
			return head = null;

		else {
			while (curr.next != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
		}
		return head;
	}
}
