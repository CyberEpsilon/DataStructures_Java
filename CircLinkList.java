public class CircLinkList<T extends LinkedList<T>>{
        private Node last;
        private int length;
        
        private class Node {
            private Node next;
            private int data;
            
            public Node(int data) {
                this.data = data;
            }
        }
        
        public CircLinkList() {
            last = null;
            length = 0;
        }
        
        public int length() {
            return length;
        }
        
        public boolean isEmpty() {
            return length == 0; //test to see if length is zero 
        }

        public void display(){ //traverse and print data 
           if(last == null){
               return; 
           } 
           Node first = last.next; 
           while(first != last){
               System.out.println(first.data + " ");
               first = first.next; 
           }
           System.out.print(first.data); 

        }

        public void insertFirst(int data){
            Node newNode = new Node(data);
            if (last == null){
                last = newNode;
            } else {
                newNode.next = last.next; 
            }
            last.next = newNode;
            length++;
        }

        public Node removeFirst(int data){
            if (isEmpty()){
                System.out.println("We can't remove nodes from an empty list.");
            }
            Node first = last.next;
            if(last.next == last){ //if there is is one element
                last = null; //make the list empty by removing that element 
            } else {
                last.next = first.next; //complete the circle by pointing to the next element and eliminating the first 
            }
            first.next = null; 
            length--; //decrement length because we have removed an element 
            return first; 
        }

        public void insertLast(int data){
            Node newNode = new Node(data);
            if(last == null){
                last = newNode; 
                last.next = last;
            } else {
                newNode.next = last.next;
                last.next = newNode;
                last = newNode;
            }
            length++; 
        }
        
        public void createCircLinkList() {
            Node first = new Node(1);
            Node second = new Node(5);
            Node third = new Node(10);
            Node fourth = new Node(15);
            
            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = first;
     
            last = fourth;
        }
        
        public static void main(String[] args) {
            CircLinkList cll = new CircLinkList<>();
            cll.createCircLinkList();
            cll.display(); 
        }
    }
    
