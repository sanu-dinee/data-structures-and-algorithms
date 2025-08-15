/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;

/**
 *
 * @author mpcs247
 */
public class stackQueue {
    private static class IntStack {
        int[] a; int top = -1;
        IntStack(int cap) { a = new int[cap]; }
        boolean isEmpty() { return top == -1; }
        boolean isFull() { return top == a.length - 1; }
        void push(int v) { if (isFull()) System.out.println("Stack full!"); else a[++top] = v; }
        int pop() { if (isEmpty()) return Integer.MIN_VALUE; return a[top--]; }
        int peekAt(int i) { return a[i]; } 
        int size() { return top + 1; }
    }

    private final IntStack s1, s2; 

    public stackQueue(int capacity) { s1 = new IntStack(capacity); s2 = new IntStack(capacity); }

    public void insert(int value) { // enqueue
        if (s1.isFull() && s2.isEmpty()) System.out.println("Queue full!");
        else s1.push(value);
    }

    public void delete() { // dequeue
        if (s2.isEmpty()) while (!s1.isEmpty()) s2.push(s1.pop());
        int val = s2.pop();
        if (val == Integer.MIN_VALUE) System.out.println("Queue empty!");
        else System.out.println("Deleted: " + val);
    }

    public void search(int value) {
       
        for (int i = s2.top; i >= 0; i--) if (s2.peekAt(i) == value) { System.out.println(value + " found."); return; }
        for (int i = 0; i <= s1.top; i++) if (s1.peekAt(i) == value) { System.out.println(value + " found."); return; }
        System.out.println(value + " not found.");
    }

    public void print() {
      
        System.out.print("Queue: ");
        for (int i = s2.top; i >= 0; i--) System.out.print(s2.peekAt(i) + " ");
        for (int i = 0; i <= s1.top; i++) System.out.print(s1.peekAt(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        stackQueue q = new stackQueue(10);
        q.insert(10); q.insert(20); q.insert(30);
        q.print(); q.search(20); q.delete(); q.print();
    }
}
