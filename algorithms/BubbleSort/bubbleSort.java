/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;
import java.util.Scanner;

/**
 *
 * @author mpcs247
 */
public class bubbleSort {
    int[] arr;
    int size;

    bubbleSort(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Insert element at position
    void insert(int index, int value) {
        if(index >= 0 && index < size) {
            arr[index] = value;
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Delete element (by value)
    void delete(int value) {
        int i;
        for(i = 0; i < size; i++) {
            if(arr[i] == value) break;
        }
        if(i == size) {
            System.out.println("Value not found!");
            return;
        }
        for(int j = i; j < size - 1; j++) {
            arr[j] = arr[j+1];
        }
        arr[size-1] = 0;
        System.out.println("Deleted " + value);
    }

    // Search element
    void search(int value) {
        for(int i = 0; i < size; i++) {
            if(arr[i] == value) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    // Print array
    void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble sort
    void bubbleSort() {
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bubbleSort bs = new bubbleSort(5);

        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) bs.insert(i, sc.nextInt());

        System.out.print("Original array: ");
        bs.print();

        bs.bubbleSort();
        bs.print();

        System.out.print("Enter value to delete: ");
        bs.delete(sc.nextInt());
        bs.print();

        System.out.print("Enter value to search: ");
        bs.search(sc.nextInt());
    }
}
