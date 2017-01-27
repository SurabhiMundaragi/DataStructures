import java.util.Hashtable;

public class RemoveDupLL {

	static Node head1;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			
			data = d;
			next = null;
		}
	}
	public static void main(String[] args) {	
		RemoveDupLL ll = new RemoveDupLL();
		RemoveDupLL.head1 = new Node(5);
		RemoveDupLL.head1.next = new Node(6);
		RemoveDupLL.head1.next.next = new Node(7);
		RemoveDupLL.head1.next.next.next = new Node(6);
		RemoveDupLL.head1.next.next.next.next = new Node(5);
		//ll.removeWithBuffer();
		//ll.removeWithoutBuffer();
		System.out.print(ll.findKthElemFromLast());
	}
	
	public void removeWithBuffer(){
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		Node previous = null;
		while(head1.next!=null){
			
			if(ht.containsKey(head1.data)){
				previous.next = head1.next;
			}
			else{
				ht.put(head1.data, 1);
				System.out.println(head1.data);
				previous = head1;
			}
			
			head1 = head1.next;
		}
	}

	public void removeWithoutBuffer(){
		
		Node current = head1;
		
		while(current!=null){
			
			Node another = current;
			while(another.next!=null){
			if(another.next.data==current.data){
				another.next = another.next.next;				
			}
			else{
				another = another.next;
			}
		}
			System.out.println(current.data);
			current = current.next;
		}
	}
	public int findKthElemFromLast(){
		int k=3;
		Node p1 = head1;
		Node p2 = head1;
		for(int i=0;i<k-1;i++){
			p2 = p2.next;		
		}
		while(p2.next!=null){
			p1 = p1.next;
			p2  = p2.next;
		}
		return p1.data;
	}
	
}
