package com.delelementarray;

import java.util.Scanner;

public class Main {

    public static int delElement(int[] arr) {
        int value_del;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  value delete: ");
        value_del = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (value_del == arr[i]) {
                int index_del = i;
                for (i = index_del; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        return value_del;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
        } while (size > 20);

        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int result = delElement(array);
        int s = 0;
        System.out.print("New array after deletion is: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

