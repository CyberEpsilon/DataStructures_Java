
public class LinkedList<T>{
	//create node inner class
	private T something;
	private T obj;
	private Node<T> head;//Every linked list has a pointer that points to the first element
	private Node<T> tail;//Every linked list should have a pointer that points to the last element

	private static class Node<T>{
		//a node in a linked list has data and a pointer to the next node
		private final T data;//data included in the node
		private Node<T> next;//pointer to next element in the list

		//Node Constructor needed for creation of an instance of a new node
		public Node(T data){
			this.data = data; //each new node will have some type of data
			this.next = null;//each new node will a pointer that points to null
		}
	}//end of Node class



	public void display(){
		Node<T> current = head; //creates a traversal pointer that points to current node
		while(current != null){//while the current pointer is still not pointing to null
			System.out.print(current.data + " --> ");
			current = current.next; //moves the current ptr to the next element in the list
		}
		System.out.println("null");
	}

	public void addFront(T value){
		Node<T> newNode = new Node<>(value);
		newNode.next = head;
		head = newNode;
	}

	//Linked List tester
	public static void main(String[] args){
		LinkedList<Integer> intList = new LinkedList<>(); //create a linked list of Integers
		LinkedList<String> strList = new LinkedList<>();
		LinkedList typeList = new LinkedList<>();

		intList.head = new Node<>(10);
		Node<Integer> secondInt = new Node<Integer>(11);
		System.out.println(secondInt);
		Node<Integer> thirdInt = new Node<Integer>(12);
		intList.head.next = secondInt;
		secondInt.next = thirdInt;
		intList.display();
		intList.addFront(1);

		//Raw types: It's unsafe but works!
		typeList.head = new Node<>("first_element");
		Node secondType = new Node<Integer>(5);
		typeList.head.next = secondType;
		Node thirdType = new Node<String>("third_element");
		secondType.next = thirdType;
		typeList.display();

		/*
			LinkedList.java:41: warning: [rawtypes] found raw type: LinkedList
			                LinkedList typeList = new LinkedList<>();
			                ^
			  missing type arguments for generic class LinkedList<T>
			  where T is a type-variable:
			    T extends Object declared in class LinkedList
			LinkedList.java:53: warning: [unchecked] unchecked assignment to variable head as member of raw type LinkedList
			                typeList.head = new Node<>("first_element");
		                        ^
		    LinkedList.java:54: warning: [rawtypes] found raw type: Node


		 */

	}

}