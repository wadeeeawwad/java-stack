public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
       this.head=null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public void remove(){
    	if (head == null)
            return ;
 
        if (head.next == null) {
            return ;
        }
 
        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;
 
        // Change next of second last
        second_last.next = null;}
 
    
    public void printValues(){
    	
    	if(head==null)return;
    	else{
    		Node runer=head;
    		while(runer != null) 
    		{
    			System.out.print(runer.value+"  ");
    			  runer = runer.next;
    		}
    		
 }
    	
    	
    	
    }
}