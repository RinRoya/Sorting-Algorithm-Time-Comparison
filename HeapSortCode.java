/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasSorting;

/**
 *
 * @author OWNER
 */
public class HeapSortCode {

    public static void HeapSort(int A[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(A, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;

            Heapify(A, i, 0);
        }
    }

    private static void Heapify(int A[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }

        if (right < n && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            Heapify(A, n, largest);
        }
    }
}
