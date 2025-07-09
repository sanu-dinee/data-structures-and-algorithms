/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListSequnced;

/**
 *
 * @author mpcs247
 */
public class LinkedList {
    
     node head;
    
   public void insert(int data) {
    // Create a new node
    node newNode = new node();
    newNode.data = data;
    newNode.next = null;

    // If list is empty, set head to new node
    if (head == null) {
        head = newNode;
    } else {
        // Start from head to find the last node
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Add new node at the end
        current.next = newNode;
    }
}

    
    public void display() {
    node current = head;

    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

    
    public void addAtFirst(int data){
        
        node node1=new node();
        node1.data=data;
        node1.next=null;
        node1.next=head;
        head=node1;
        
    }
    public void addInAnyLocation(int index,int data){
        node node1=new node();
        node1.data=data;
        node1.next=null;
        
        if(index==0){
            addAtFirst(data);
        }
        
        node n=head;
        
        for(int i=0;i<index-1;i++){
            //traversing to next node
            n=n.next;
            
            }
        node1.next=n.next;
        n.next=node1;
    }
    
    public void delete(int index){
        

        if(head==null){
            System.out.println("List is empty");
        }
        else if(index==0){
            head=head.next;
        }
        
        else{
            node n=head;
             // Temporary node for the one to be deleted
            node temp=null;
            for(int i=0;i<index-1;i++){
                // Traverse to the node before the one to delete
                n=n.next;
            }
            temp=n.next;
            n.next=temp.next;
            System.out.println("Deleted element: "+temp.data);
            temp=null;
         }
    }
    public void removeFirst(){
         if (head == null) {
                System.out.println("List is empty");
               return;
    }

         System.out.println("Deleted element: " + head.data);
         head = head.next; // Move head to next node
       }
    
    
    public void removeLast() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.next == null) {
        // Only one node in the list
        System.out.println("Deleted element: " + head.data);
        head = null;
        return;
    }

    node current = head;
    while (current.next.next != null) {
        current = current.next; // Traverse to the second last node
    }

    // current is now the second last node
    System.out.println("Deleted element: " + current.next.data);
    current.next = null; // Remove reference to last node
  }
    
   public void reverse() {
    node previous = null;       
    node current = head;        
    // To temporarily store the next node
    node next = null;           

    while (current != null) {
        next = current.next;    
        current.next = previous; // Reverse the current node’s pointer
        previous = current;     // Move previous to this node
        current = next;         // Move to the next node
    }

    head = previous;            // Update head to the new first node
    
}

}
