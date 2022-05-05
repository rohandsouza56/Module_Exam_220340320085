
class ReverseLinkedList{
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void append(int newdata){
		Node newNode = new Node(newdata);
		Node n = head;
		
		if(head == null){
			head = newNode;
			return;
		}
		
		while(n.next!=null){
			n = n.next;
		}
		
		n.next = newNode;
		newNode.next = null;
		
	}
	
	void display(){
		Node n = head;
		
		while(n!=null){
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println();
	}
	
	void reverse(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		Node prev = null;
		Node nextele = null;
		
		while(current!=null){
			nextele = current.next;
			current.next = prev;
			prev = current;
			current = nextele;
		}
		
		head = prev;
	}
	
	
	public static void main(String agrs[]){
		ReverseLinkedList l = new ReverseLinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.display();
		l.reverse();
		l.display();
	}
}