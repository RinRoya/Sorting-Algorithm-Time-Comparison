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
public class SelectionSortCode {

    public static void SelectionSort(int[] A, int n) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[index]) {
                    index = j;
                }
            }
            int smallerNumber = A[index];
            A[index] = A[i];
            A[i] = smallerNumber;
        }
    }
}
