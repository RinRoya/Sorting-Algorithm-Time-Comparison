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
public class InsertionSortCode {

    public static void InsertionSort(int[] A, int n) {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
}
