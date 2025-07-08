/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githubsubmission.LinkedList;

/**
 *
 * @author mpcs247
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        
        list.addAtFirst(20);
        
        list.addInAnyLocation(1, 55);
        list.insert(6);
        list.display();
        
        list.delete(2);
        list.display();
        
    }
    
}
