/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStack;

/**
 *
 * @author mpcs247
 */
public class arrayStack {
     private int[] stack;
    private int top;

    public arrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void insert(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack full!");
            return;
        }
        stack[++top] = value;
    }

    public void delete() {
        if (top == -1) {
            System.out.println("Stack empty!");
            return;
        }
        System.out.println("Deleted: " + stack[top--]);
    }

    public void search(int value) {
        for (int i = 0; i <= top; i++) {
            if (stack[i] == value) {
                System.out.println(value + " found.");
                return;
            }
        }
        System.out.println(value + " not found.");
    }

    public void print() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        arrayStack s = new arrayStack(5);
        s.insert(10); s.insert(20); s.insert(30);
        s.print();
        s.search(20);
        s.delete();
        s.print();
    }
}
