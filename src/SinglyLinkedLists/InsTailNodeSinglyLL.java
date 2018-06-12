package SinglyLinkedLists;

public class InsTailNodeSinglyLL {

	class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}
	}

	public static InsTailNodeSinglyLL insertTail;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		ListNode inputHead = insertTail.new ListNode(1);
		System.out.println("Input Head Node = " + inputHead.data);

		ListNode resultHead = insertAtTail(inputHead, 2);
		System.out.println("The result after insertion at the Tail = " + resultHead.data);
	}
	
	//Own solved - Working solution
	public static ListNode insertAtTail(ListNode head, int data) {
		ListNode newNode = insertTail.new ListNode(data);
		if (head == null)
			head = newNode;

		else {
			ListNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		return head;
	}

}
