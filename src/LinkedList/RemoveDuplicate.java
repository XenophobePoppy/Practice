package LinkedList;

import java.util.Hashtable;

public class RemoveDuplicate {
	public static void removedups(LinkedListNode head) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListNode current = head;
		while (current != null) {
			if (table.containsKey(current.data)) {
				current = current.next;
			} else {
				table.put(current.data, true);
				System.out.print(current.data);
				current = current.next;
			}
		}
	}

	public static void removedups1(LinkedListNode node) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListNode previous = null;

		while (node != null) {
			if (table.containsKey(node.data)) {
				previous.next = node.next;
			} else {
				table.put(node.data, true);
				System.out.print(node.data);
				previous = node;
			}
			node = node.next;
		}
	}
	
	public static void removedups_without_buffer(LinkedListNode node){
		if(node==null){
			return;
		}
		
		LinkedListNode current=node;
		while(current !=null){
			LinkedListNode runner = current;
			while(runner.next !=null){
				if(runner.next.data==current.data)
					runner.next=runner.next.next;
					
				else
					runner=runner.next;
				}
			System.out.println(current.data);
			current=current.next;
			}
		}
	

	public static void main(String args[]) {
//		LinkedListNode list = new LinkedListNode();
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(3);
		LinkedListNode a5 = new LinkedListNode(4);

//		LinkedListNode a1 = new LinkedListNode();
		
		
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		
		removedups(a1);
		System.out.println();
		removedups1(a1);
		System.out.println();
		removedups_without_buffer(a1);
		
	}
}
