package LinkedList;


public class FindLoop {

	public static LinkedListNode findLoop(LinkedListNode head){
		LinkedListNode fast=head;
		LinkedListNode slow=head;
		boolean loop=false;
		
		while(fast != null && fast.next != null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				loop=true;
			}
		}
		
//		if(fast == null || fast.next == null){
//			return null;
//		}
		
		if(loop){
			slow=head;
			while(fast != slow){
				fast=fast.next;
				slow=slow.next;
			}
			return slow;
		}
		
		return null;
	}
	
	

	
	public static void main(String args[]){
		LinkedListNode list= new LinkedListNode();
		list.addlist(2);
		list.addlist(3);
		list.printList();
//		System.out.print(list.data);
		
		
	}
}
