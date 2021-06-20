/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasSorting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author OWNER
 */
public class mainExecution {

    static Random inran = new Random();

    public static void main(String[] args) {
        int n;
        int[] arr, A, B;

        n = 7;
        arr = new int[n];
        arr = GenerateArray(arr, n);

        A = arr.clone();
        B = arr.clone();

        System.out.println("Array A");
        System.out.println(Arrays.toString(A));
        System.out.println("Array A setelah diurutkan dengan metode Merge Sort");
        MergeSortCode.MergeSort(A, 0, n - 1);
        System.out.println(Arrays.toString(A));

        System.out.println();

        System.out.println("Array B");
        System.out.println(Arrays.toString(B));
        System.out.println("Array B setelah diurutkan dengan metode Heap Sort");
        HeapSortCode.HeapSort(B, n);
        System.out.println(Arrays.toString(B));
    }

    public static int[] GenerateArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            A[i] = inran.nextInt(3 * n);
        }
        
        return A;
    }
}
