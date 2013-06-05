package LinkedList;

public class nthtoLast {
	//iterative 
	LinkedListNode nthToLast(LinkedListNode head, int n) {
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
	
	//recursive 
	public int kthToLast(LinkedListNode head, int k){
		int result=-1;
		if(head==null){
			return -1;
		}
		int count= kthToLast(head.next, k)+1;
		
		if(count == k){
			result = head.data;
		}
		return result;
	}
}
