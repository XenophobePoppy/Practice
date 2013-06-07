package LinkedList;

//import LinkedLists.LinkedListNode;


public class FindLoop {

	public static LinkedListNode findLoop(LinkedListNode head){
		LinkedListNode fast=head;
		LinkedListNode slow=head;
//		boolean loop=false;
		
		while(fast != null && fast.next != null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
//				loop=true;
				break;
			}
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
//		if(loop){
			slow=head;
			while(slow != fast){
				fast=fast.next;
				slow=slow.next;
			}
			return fast;
//		}
//		
//		return null;
	}
	
	

	
	public static void main(String args[]){
		LinkedListNode node1 = new LinkedListNode(9);
		LinkedListNode node2 = new LinkedListNode(7);
		LinkedListNode node3 = new LinkedListNode(6);
		LinkedListNode node4 = new LinkedListNode(3);
		LinkedListNode node5 = new LinkedListNode(3);
		LinkedListNode node6 = new LinkedListNode(5);
				
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node3;

		
		LinkedListNode result = findLoop(node1);
		System.out.println(result.data);
		
		
	}
}
