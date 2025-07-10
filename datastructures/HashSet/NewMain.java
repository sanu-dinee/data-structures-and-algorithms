/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashSet;

/**
 *
 * @author mpcs247
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        set setElement=new set(10);
        
        setElement.add(2);
        setElement.add(3);
        setElement.add(8);
        setElement.add(10);
        setElement.add(50);
        
        setElement.display();
        
        boolean val1=setElement.contains(0);
        boolean val2=setElement.contains(8);
        
        System.out.println(val1);
        System.out.println(val2);
        
        setElement.remove(10);
        setElement.remove(3);
        setElement.remove(5);
        
        setElement.display();
        
        
        
        
        
     }
    
}
