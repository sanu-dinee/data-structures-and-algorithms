/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedHashSetSequenced.LinkedHashSet;

/**
 *
 * @author mpcs247
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LinkedHashSet hashSet=new LinkedHashSet(10);
        
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(50);
        
        hashSet.display();
        
        boolean val1=hashSet.contains(0);
        boolean val2=hashSet.contains(8);
        
        hashSet.removeFirst();
        hashSet.removeLast();
        
        System.out.println(val1);
        System.out.println(val2);
        
        hashSet.display();
        System.out.println("\n");
        
       hashSet.addFirst(14);
        hashSet.addLast(32);
        
        hashSet.display();
        
        
        hashSet.reverse();
        System.out.println("\n");
        hashSet.display();
        
    }
    
}
