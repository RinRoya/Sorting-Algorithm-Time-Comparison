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
public class QuickSortCode {

    public static void QuickSort(int[] A, int left, int right) {
        if (left < right) {
            int iPivot = (left + right) / 2;
            int pivot = A[iPivot];
            int pLeft = left;
            int pRight = right;
            while (pLeft <= pRight) {
                while (A[pLeft] < pivot) {
                    pLeft++;
                }
                while (A[pRight] > pivot) {
                    pRight--;
                }
                if (pLeft <= pRight) {
                    int temp = A[pLeft];
                    A[pLeft] = A[pRight];
                    A[pRight] = temp;
                    pLeft++;
                    pRight--;
                }
            }
            QuickSort(A, left, pRight);
            QuickSort(A, pLeft, right);
        }
    }
}
