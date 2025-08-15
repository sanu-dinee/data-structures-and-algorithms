/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueStack;

/**
 *
 * @author mpcs247
 */
public class queueStack {
    private int[] q1, q2;
    private int front1, rear1, size1;
    private int front2, rear2, size2;
    private int capacity;

    public queueStack(int capacity) {
        this.capacity = capacity;
        q1 = new int[capacity];
        q2 = new int[capacity];
        front1 = front2 = 0;
        rear1 = rear2 = -1;
        size1 = size2 = 0;
    }

    private void enqueue1(int value) {
        if (size1 == capacity) return;
        q1[++rear1] = value;
        size1++;
    }

    private int dequeue1() {
        if (size1 == 0) return -1;
        int val = q1[front1++];
        size1--;
        return val;
    }

    private void enqueue2(int value) {
        if (size2 == capacity) return;
        q2[++rear2] = value;
        size2++;
    }

    private int dequeue2() {
        if (size2 == 0) return -1;
        int val = q2[front2++];
        size2--;
        return val;
    }

    public void insert(int value) {
        enqueue2(value);
        while (size1 > 0) {
            enqueue2(dequeue1());
        }
        int[] tq = q1; q1 = q2; q2 = tq;
        int tf = front1; front1 = front2; front2 = tf;
        int tr = rear1; rear1 = rear2; rear2 = tr;
        int ts = size1; size1 = size2; size2 = ts;
    }

    public void delete() {
        if (size1 == 0) {
            System.out.println("Stack empty!");
        } else {
            System.out.println("Deleted: " + dequeue1());
        }
    }

    public void search(int value) {
        for (int i = front1; i <= rear1; i++) {
            if (q1[i] == value) {
                System.out.println(value + " found.");
                return;
            }
        }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("Stack: ");
        for (int i = front1; i <= rear1; i++) {
            System.out.print(q1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queueStack s = new queueStack(5);
        s.insert(10); s.insert(20); s.insert(30);
        s.print();
        s.search(20);
        s.delete();
        s.print();
    }
}
