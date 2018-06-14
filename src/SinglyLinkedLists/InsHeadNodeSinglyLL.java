package SinglyLinkedLists;

public class InsHeadNodeSinglyLL {

	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static InsHeadNodeSinglyLL insertHead;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = insertHead.new ListNode(1);
		System.out.println("Input Head Node = " + inputHead.data);

		ListNode resultHead = insertAtHead(inputHead, 2);
		System.out.println("The result after insertion at the Tail = " + resultHead.data);
	}

	//Own solved - Working solution
	public static ListNode insertAtHead(ListNode head, int data) {
		ListNode newNode = insertHead.new ListNode(data);

		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

}
