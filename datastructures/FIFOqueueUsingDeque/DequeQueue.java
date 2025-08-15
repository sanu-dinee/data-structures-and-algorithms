/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIFOqueueUsingDeque;

/**
 *
 * @author mpcs247
 */
public class DequeQueue {
      private static class Node {
        int val; Node prev, next;
        Node(int v) { val = v; }
    }
    private Node head, tail; // head = front, tail = back
    private int size = 0;

    // Insert at back (enqueue)
    public void insert(int value) {
        Node n = new Node(value);
        if (tail == null) { head = tail = n; }
        else { tail.next = n; n.prev = tail; tail = n; }
        size++;
    }

    // Delete from front (dequeue)
    public void delete() {
        if (head == null) { System.out.println("Queue empty!"); return; }
        System.out.println("Deleted: " + head.val);
        head = head.next;
        if (head != null) head.prev = null; else tail = null;
        size--;
    }

    public void search(int value) {
        Node cur = head;
        while (cur != null) { if (cur.val == value) { System.out.println(value + " found."); return; } cur = cur.next; }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("Queue: ");
        for (Node cur = head; cur != null; cur = cur.next) System.out.print(cur.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        DequeQueue q = new DequeQueue();
        q.insert(10); q.insert(20); q.insert(30);
        q.print(); q.search(20); q.delete(); q.print();
    }
}

