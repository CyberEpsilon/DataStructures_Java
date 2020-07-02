
public class DoublyLinkedList extends LinkedList{
    private Node head;
    private Node tail;
    private int length;

    private class Node{
        private int data;
        private Node next;
        private Node previous;

        public Node(int data){
            this.data = data; 
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length(){
        return length; 
    }

    public void displayForward() {
		if(head == null) {
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
    }
    
    public boolean isEmpty(){
        if (tail == null){
            return true; 
        }


    }
	
	public void displayBackward() {
		if(head == null) {
			return;
		}
		
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	public void insertEnd(int value) {
	    Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	
	public Node deleteLast() {
		if(isEmpty()) {
			System.out.println("This list is empty.")
		}
		
		Node temp = tail;
		if(head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertEnd(1);
		dll.insertEnd(2);
		dll.insertEnd(3);
		
		dll.displayForward();
		
		dll.deleteLast();
		dll.deleteLast();
		
		dll.displayForward();
	}
}

    
}