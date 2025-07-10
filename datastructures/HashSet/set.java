/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

/**
 *
 * @author mpcs247
 */
public class set {
    //Array to store the actual data
      private int[] data;
      // Boolean array to track which slots are occupied
      private boolean[] occupied;
      
      public set(int capacity){
        data=new int[capacity];
        occupied=new boolean[capacity];
       }
      
      public void add(int val){
          int index=Hash(val);
          while(occupied[index]){
              index=(index+1)%data.length;
          } 
           // Store value at the available index
          data[index]=val;
          //mark that index as occupied
          occupied[index]=true;
      }
      
      public boolean contains(int val){
          int index=Hash(val);
          while(occupied[index]){
              if(data[index]==val){
                  return true;
                  
              }
              index=(index+1)%data.length;
          }
          return false;
      }
      
      public void remove(int val) {
    int index = Hash(val);

    while (occupied[index]) {
        if (data[index] == val) {
            occupied[index] = false;
            System.out.println(val + " removed from index " + index);
            return;
        }
        index = (index + 1) % data.length;
    }

   System.out.println(val + " is not in the list");
}

      public void display() {
    for (int i = 0; i < data.length; i++) {
        if (occupied[i]) { // Only display occupied slots
            System.out.println(data[i]);
        }
    }
}
       // Hash function to compute index from value
      public int Hash(int val){
          //Ensure non-negative index
          return Math.abs(val)%data.length;
      }
      
}
