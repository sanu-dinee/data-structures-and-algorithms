/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStack;

/**
 *
 * @author mpcs247
 */
public class listStack {
     private static class Node { int val; Node next; Node(int v){ val=v; } }
    private Node head; // top

    public void insert(int value) { // push
        Node n = new Node(value);
        n.next = head;
        head = n;
    }

    public void delete() { // pop
        if (head == null) { System.out.println("Stack empty!"); return; }
        System.out.println("Deleted: " + head.val);
        head = head.next;
    }

    public void search(int value) {
        for (Node cur = head; cur != null; cur = cur.next)
            if (cur.val == value) { System.out.println(value + " found."); return; }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("Stack (top..bottom): ");
        for (Node cur = head; cur != null; cur = cur.next) System.out.print(cur.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        listStack s = new listStack();
        s.insert(10); s.insert(20); s.insert(30);
        s.print(); s.search(20); s.delete(); s.print();
    }
}
