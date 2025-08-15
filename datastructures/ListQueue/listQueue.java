/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListQueue;

/**
 *
 * @author mpcs247
 */
public class listQueue {
    private static class Node { int val; Node next; Node(int v){ val=v; } }
    private Node head, tail; 
    private int size = 0;

    public void insert(int value) { 
        Node n = new Node(value);
        if (tail == null) { head = tail = n; }
        else { tail.next = n; tail = n; }
        size++;
    }

    public void delete() { 
        if (head == null) { System.out.println("Queue empty!"); return; }
        System.out.println("Deleted: " + head.val);
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    public void search(int value) {
        for (Node cur = head; cur != null; cur = cur.next)
            if (cur.val == value) { System.out.println(value + " found."); return; }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("Queue: ");
        for (Node cur = head; cur != null; cur = cur.next) System.out.print(cur.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        listQueue q = new listQueue();
        q.insert(10); q.insert(20); q.insert(30);
        q.print(); q.search(20); q.delete(); q.print();
    }
}
