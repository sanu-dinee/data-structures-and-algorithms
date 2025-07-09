/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListSequnced;

/**
 *
 * @author mpcs247
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(82);
        list.insert(21);
        
        list.addAtFirst(20);
        
        list.addInAnyLocation(1, 55);
        list.insert(6);
        
        list.display();
        list.delete(2);
        list.removeLast();
        list.removeFirst();
        list.display();
        list.reverse();
        System.out.println("After reversing");
        list.display();
    }
    
}
