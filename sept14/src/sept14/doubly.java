package sept14;

public class doubly {  
		    class Node{    
		        String data;    
		        Node prev;    
		        Node next;    
		  
		        public Node(String data) {    
		            this.data = data;  
		            this.prev=null;
		            this.next=null;
		        }    
		    }    
		    //Initialize head and tail for the doubly linked list    
		    Node head = null;  
		    Node tail = null;    
		  
		    //Create addNewNode() method to add a node into a list   
		    public void addNewNode(String data) {    
		        Node newNode = new Node(data);   //Create node 
		        if(head == null) {  //Check whether our doubly linked list is empty or not  
		                            //The newNode is pointed by both head or tail   
		            head = newNode;  
		            tail = newNode;  //It is first node so prev will point to null     
		            head.prev = null;  //It is also last node so tail's next will point to null     
		            tail.next = null;    
		        }  
		        //Execute when the doubly linked list is not empty  
		        else {  
		            tail.next = newNode;   //The newly created node will be the last node, so now tail's next will point to that newly created node    
		            newNode.prev = tail;    //The tail is pointing to the second last node so the newly created node's prev will point to tail   
		            tail = newNode;//The newly created node will become new tail because it is last node in the doubly linked list     		               
		            tail.next = null; //The newly created node will be the last node so tail's next will be null    
		        }    
		    }    
		  
		    //Create showData() method for displaying data of doubly linked list    
		    public void showData() {  
		        //intialize a new node current that will point to head    
		        Node current = head;    
		        //Check whether the doubly linked list is empty or not  
		        if(head == null) {  
		            //Print a statement and pass the control flow into the main() method  
		            System.out.println("List is empty");    
		            return;    
		        }  
		        //Print a statement  
		        System.out.println("Nodes of doubly linked list: ");    
		        //Iterate the doubly linked list using while  
		        while(current != null) {    
		            //Print tha data on that particular node and then increment the pointer for indicating next node    
		            System.out.print(current.data + " ");    
		            current = current.next;    
		        }    
		    }    
		  
		    public static void main(String[] args) {    
		  
		      doubly obj = new doubly();    
		  
		        //Add nodes into the doubly linked list   
		        obj.addNewNode("India");    
		        obj.addNewNode("Korea");    
		        obj.addNewNode("USA");    
		        obj.addNewNode("Brazil");    
		        
		  
		        //Call showData() method for displaying doubly linked list data    
		        obj.showData();    
		    }    
		  
	}


