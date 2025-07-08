/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githubsubmission.LinkedList;

/**
 *
 * @author mpcs247
 */
public class LinkedList {

    Node head;
    
    public void insert (int data){
        //create new node
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(head==null){
            head=node; //if list empty new node becomes the node
        }
        else{
            //start from head
            Node n=head;
            while(n.next!=null){
                n = n.next;
            }
            
            n.next=node;
        }
    }
    
    public void display(){
        
        Node node=head;
        
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    
    public void addAtFirst(int data){
        
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
        
    }
    public void addInAnyLocation(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(index==0){
            addAtFirst(data);
        }
        
        Node n=head;
        
        for(int i=0;i<index-1;i++){
            //traversing to next node
            n=n.next;
            
            }
        node.next=n.next;
        n.next=node;
    }
    
    public void delete(int index){
        

        if(head==null){
            System.out.println("List is empty");
        }
        else if(index==0){
            head=head.next;
        }
        
        else{
            Node n=head;
             // Temporary node for the one to be deleted
            Node temp=null;
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
    
}


