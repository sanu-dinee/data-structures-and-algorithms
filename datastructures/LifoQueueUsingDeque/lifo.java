/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIFOqueueUsingDeque;

/**
 *
 * @author mpcs247
 */
public class lifo {
    private static class Node {
        int val; Node prev, next;
        Node(int v) { val = v; }
    }
    private Node head, tail; 
    private int size = 0;

    // Insert at front (push)
    public void insert(int value) {
        Node n = new Node(value);
        if (head == null) { head = tail = n; }
        else { n.next = head; head.prev = n; head = n; }
        size++;
    }

    // Delete from front (pop)
    public void delete() {
        if (head == null) { System.out.println("Stack (LIFO) empty!"); return; }
        System.out.println("Deleted: " + head.val);
        head = head.next;
        if (head != null) head.prev = null; else tail = null;
        size--;
    }

    public void search(int value) {
        for (Node cur = head; cur != null; cur = cur.next)
            if (cur.val == value) { System.out.println(value + " found."); return; }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("LIFO (top..bottom): ");
        for (Node cur = head; cur != null; cur = cur.next) System.out.print(cur.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        lifo s = new lifo();
        s.insert(10); s.insert(20); s.insert(30);
        s.print(); s.search(20); s.delete(); s.print();
    }
}

