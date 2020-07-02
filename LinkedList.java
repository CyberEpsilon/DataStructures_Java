
public class LinkedList<T>{
	//
	private Node head; 
	private Node tail; 

	//create LinkedList constructor
	public LinkedList(){
		head = null;
		tail = null; 
	}
	//create node inner class
	public class Node{
		private T data; 
		private Node next;
    //create node constructor
		public Node(T data){
			this.data = data; 
			this.next = null;
		}

	}
	//find the length of the linked list
	public int length(){
		if(head == null){
			return 0;
		}
		int count = 0;
		return count; 
	}

	



	//Insert global node variables 
	

	//addFirst Method



	//add Last Method



	//reverse linked list


	//Display the linked list; prints the list


	//Find the middle node

	//Find the nth node from the end of the list 


	//remove duplicates from a sorted linked list


	//Insert a node into the sorted linked list 


	//Remove a given key from the linked list 


	//Detect a loop in the linked list 



	//Tester class
	public static void main(String[] args) {
		
	}




	

}