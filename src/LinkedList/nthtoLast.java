package LinkedList;

public class nthtoLast {
	// iterative
	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		if (head == null || n < 1) {
			return null;
		}
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int i = 0; i < n - 1; i++) {
			if (p2 == null) {
				return null;// n is longer than size
			}
			p2 = p2.next;
		}
		while (p2.next != null) {
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
	}

	// recursive
	public int kthToLast(LinkedListNode head, int k) {
		int result = -1;
		if (head == null) {
			return -1;
		}
		int count = kthToLast(head.next, k) + 1;

		if (count == k) {
			result = head.data;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedListNode node1 = new LinkedListNode(2);
		LinkedListNode node2 = new LinkedListNode(1);
		LinkedListNode node3 = new LinkedListNode(2);
		LinkedListNode node4 = new LinkedListNode(3);
		LinkedListNode node5 = new LinkedListNode(5);
		LinkedListNode node6 = new LinkedListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		int n = 3;
		LinkedListNode node = nthToLast(node1, n);
		System.out.print(node.data);
	}
}