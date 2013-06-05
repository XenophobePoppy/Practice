package LinkedList;

public class LinkedListNode {

	public int data;
	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode head;
	
	public LinkedListNode(int data)
	{
		this.data = data;
	}
	
	public LinkedListNode(int data, LinkedListNode l1, LinkedListNode l2)
	{
		this.data = data;
	}
	

	public void setNext(LinkedListNode node)
	{
		this.next = node;
	}
	
	
//	public LinkedListNode add(int data){
//		LinkedListNode temp = head;
//		if((temp.next==null) && (temp.data == 0)){
//			temp.data = data;
//			return temp;
//		}else{
//			while(temp.next != null){
//				temp=temp.next;
//			}
//			
//			LinkedListNode newNode=new LinkedListNode();
//			newNode.data=data;
//			
//			temp.next=newNode;
//			return newNode; 
//		}
//	}
	
	public void addlist(int data){
		this.data = data;
	}
	
//	public void printList(){
//		LinkedListNode temp = new LinkedListNode();
//		temp = head;
//		while(temp !=null){
//			System.out.print(temp.data);
//			temp=temp.next;
//		}
//		System.out.println("null");
//	}
	

}
