/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasSorting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class mainComparison {

    static Scanner input = new Scanner(System.in);
    static Random inran = new Random();

    public static void main(String[] args) {
        int n;
        int[] arr, A, B, C, D, E, F;

        System.out.print("Masukkan banyak data: ");
        n = input.nextInt();
        arr = new int[n];
        arr = GenerateArray(arr, n);

        A = arr.clone();
        B = arr.clone();
        C = arr.clone();
        D = arr.clone();
        E = arr.clone();
        F = arr.clone();

        /*
         Case 1 : Bubble Sort
         Case 2 : Insertion Sort
         Case 3 : Selection Sort
         Case 4 : Quick Sort
         Case 5 : Merge Sort
         Case 6 : Heap Sort
         */
        
        System.out.println("------------------------------------------");
        System.out.println("Waktu eksekusi untuk " + n + " data");
        System.out.println("------------------------------------------");
        System.out.println("Metode\t\t\tWaktu(ns)");

        System.out.println("Bubble Sort\t\t" + Sort(A, n, 1));
        System.out.println("Insertion Sort\t\t" + Sort(B, n, 2));
        System.out.println("Selection Sort\t\t" + Sort(C, n, 3));
        System.out.println("Quick Sort\t\t" + Sort(D, n, 4));
        System.out.println("Merge Sort\t\t" + Sort(E, n, 5));
        System.out.println("Heap Sort\t\t" + Sort(F, n, 6));

        System.out.println("------------------------------------------");
    }

    public static int[] GenerateArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            A[i] = inran.nextInt(3 * n);
        }
        
        return A;
    }

    public static long Sort(int[] A, int n, int choice) {
        long startTime = 0;
        long endTime = 0;

        switch (choice) {
            case 1:
                startTime = System.nanoTime();
                BubbleSortCode.BubbleSort(A, n);
                endTime = System.nanoTime();
                break;
            case 2:
                startTime = System.nanoTime();
                InsertionSortCode.InsertionSort(A, n);
                endTime = System.nanoTime();
                break;
            case 3:
                startTime = System.nanoTime();
                SelectionSortCode.SelectionSort(A, n);
                endTime = System.nanoTime();
                break;
            case 4:
                startTime = System.nanoTime();
                QuickSortCode.QuickSort(A, 0, n - 1);
                endTime = System.nanoTime();
                break;
            case 5:
                startTime = System.nanoTime();
                MergeSortCode.MergeSort(A, 0, n - 1);
                endTime = System.nanoTime();
                break;
            case 6:
                startTime = System.nanoTime();
                HeapSortCode.HeapSort(A, n);
                endTime = System.nanoTime();
                break;
            default:
                System.out.println("Tidak ada pilihan metode sorting");
        }

        return endTime - startTime;
    }
}
