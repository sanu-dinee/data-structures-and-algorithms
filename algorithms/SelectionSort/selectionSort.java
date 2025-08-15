/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionSort;
import java.util.Scanner;
/**
 *
 * @author mpcs247
 */
public class selectionSort {
    int[] arr;
    int size;

    selectionSort(int size) {
        this.size = size;
        arr = new int[size];
    }

    void insert(int index, int value) {
        if(index >= 0 && index < size) arr[index] = value;
        else System.out.println("Invalid index!");
    }

    void delete(int value) {
        int i;
        for(i = 0; i < size; i++) if(arr[i] == value) break;
        if(i == size) { System.out.println("Value not found!"); return; }
        for(int j = i; j < size - 1; j++) arr[j] = arr[j+1];
        arr[size-1] = 0;
        System.out.println("Deleted " + value);
    }

    void search(int value) {
        for(int i = 0; i < size; i++) if(arr[i] == value) {
            System.out.println("Found at index " + i); return;
        }
        System.out.println("Not Found");
    }

    void print() {
        for(int i = 0; i < size; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    void selectionSort() {
        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for(int j = i+1; j < size; j++)
                if(arr[j] < arr[minIndex]) minIndex = j;
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array sorted using Selection Sort");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        selectionSort ss = new selectionSort(5);

        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) ss.insert(i, sc.nextInt());

        System.out.print("Original array: ");
        ss.print();

        ss.selectionSort();
        ss.print();

        System.out.print("Enter value to delete: ");
        ss.delete(sc.nextInt());
        ss.print();

        System.out.print("Enter value to search: ");
        ss.search(sc.nextInt());
    }
}
