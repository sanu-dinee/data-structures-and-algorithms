/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author mpcs247
 */
public class arrayList {
     private int[] a;
    private int size;

    public arrayList() {
        a = new int[4];
        size = 0;
    }

    public void insert(int value) {
        ensureCapacity(size + 1);
        a[size++] = value;
    }

    public void delete(int value) {
        int idx = indexOf(value);
        if (idx == -1) { System.out.println("Not found!"); return; }
        for (int i = idx; i < size - 1; i++) a[i] = a[i + 1];
        size--;
        System.out.println("Deleted: " + value);
    }

    public void search(int value) {
        System.out.println(indexOf(value) != -1 ? value + " found." : value + " not found.");
    }

    public void print() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    private void ensureCapacity(int cap) {
        if (cap <= a.length) return;
        int[] b = new int[Math.max(a.length * 2, cap)];
        for (int i = 0; i < size; i++) b[i] = a[i];
        a = b;
    }

    private int indexOf(int value) {
        for (int i = 0; i < size; i++) if (a[i] == value) return i;
        return -1;
    }

    public static void main(String[] args) {
        arrayList arr = new arrayList();
        arr.insert(10); arr.insert(20); arr.insert(30);
        arr.print(); arr.search(20); arr.delete(20); arr.print();
    }
}
