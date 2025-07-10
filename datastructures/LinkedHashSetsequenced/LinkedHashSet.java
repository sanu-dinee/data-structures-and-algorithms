/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSetSequenced.LinkedHashSet;

/**
 *
 * @author mpcs247
 */
public class LinkedHashSet {
    
     private int[] data;
      // Boolean array to track which slots are occupied
      private boolean[] occupied;
      
      public LinkedHashSet(int capacity){
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
      
    public void addFirst(int val) {
        for (int i = 0; i < data.length; i++) {
            if (!occupied[i]) {
                data[i] = val;
                occupied[i] = true;
                return;
            }
        }
        System.out.println("Set is full. Cannot add " + val);
    }

    public void addLast(int val) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (!occupied[i]) {
                data[i] = val;
                occupied[i] = true;
                return;
            }
        }
        System.out.println("Set is full. Cannot add " + val);
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
      public void removeFirst(){
          for(int i=0;i<data.length;i++){
              while(occupied[i]){
                  if(i==0){
                      occupied[i]=false;
                      System.out.println("removed element: "+data[i]);
                      return;
                      
                  }
              }
          }
      }
      
     public void removeLast() {
    for (int i = data.length - 1; i >= 0; i--) {  
        if (occupied[i]) {                       
            System.out.println("Removed element: " + data[i]);
            occupied[i] = false;                 
            return;
        }
    }
    System.out.println("Set is empty.");
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
      
     public void reverse() {
    int left = 0;
    int right = data.length - 1;

    while (left < right) {
        // Swap the values
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // Swap the occupied status too
        boolean tempFlag = occupied[left];
        occupied[left] = occupied[right];
        occupied[right] = tempFlag;

        left++;
        right--;
    }

    
}
      
    
}
