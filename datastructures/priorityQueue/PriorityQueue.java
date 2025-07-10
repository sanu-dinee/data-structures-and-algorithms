/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author mpcs247
 */
public class PriorityQueue {
    
    class Node {
    int data;
    int priority;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}

      
     Node[] queue;
    int size;

    public PriorityQueue(int capacity) {
        queue = new Node[capacity];
        size = 0;
    }

    public void insert(int data, int priority) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        Node newNode = new Node(data, priority);
        int i = size - 1;

        // Shift nodes with higher priority to the right
        while (i >= 0 && queue[i].priority > priority) {
            queue[i + 1] = queue[i];
            i--;
        }

        queue[i + 1] = newNode;
        size++;

        
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Priority Queue:");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[i].data);
        }
    }

    public void remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        Node removed = queue[0];

        // Shift all elements left
        for (int i = 1; i < size; i++) {
            queue[i - 1] = queue[i];
        }

        size--;
        System.out.println("Removed: " + removed.data);
    }
    
    public void contains(int val) {
    for (int i = 0; i < size; i++) { 
        if (queue[i].data == val) {
            System.out.println(val + " is in the queue ");
            return;  // Exit early if found
        }
    }
    System.out.println(val + " is not in the queue");
}

}