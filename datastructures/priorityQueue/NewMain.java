/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author mpcs247
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PriorityQueue node=new PriorityQueue(10);
        
        node.insert(32, 1);
        node.insert(20, 5);
        node.insert(30,2);
        node.insert(14,0);
        node.insert(35,3);
        node.insert(85,4);
        node.insert(98,6);
        node.insert(35,7);
        
        node.display();
        
        node.remove();
        node.contains(54);
        node.contains(32);
        
        node.display();
    }
    
    
    
}
