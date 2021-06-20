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
public class MergeSortCode {

    public static void MergeSort(int[] A, int m, int n) {
        int mid;
        if (m != n) {
            mid = (m + n) / 2;
            MergeSort(A, m, mid);
            MergeSort(A, mid + 1, n);
            Merge(A, m, mid, mid + 1, n);
        }
    }

    private static void Merge(int[] A, int sub1_left, int sub1_right, int sub2_left, int sub2_right) {

        int[] temp;
        int sub_size, sub_index, sub1_left_index, sub2_left_index;

        sub_size = sub2_right - sub1_left + 1;
        temp = new int[sub_size];
        sub_index = 0;
        sub1_left_index = sub1_left;
        sub2_left_index = sub2_left;

        while (sub1_left_index <= sub1_right && sub2_left_index <= sub2_right) {
            if (A[sub1_left_index] < A[sub2_left_index]) {
                temp[sub_index] = A[sub1_left_index];
                sub1_left_index++;
            } else {
                temp[sub_index] = A[sub2_left_index];
                sub2_left_index++;
            }
            sub_index++;
        }

        while (sub1_left_index <= sub1_right) {
            temp[sub_index] = A[sub1_left_index];
            sub1_left_index++;
            sub_index++;
        }

        while (sub2_left_index <= sub2_right) {
            temp[sub_index] = A[sub2_left_index];
            sub2_left_index++;
            sub_index++;
        }

        System.arraycopy(temp, 0, A, sub1_left, sub_size);
    }
}
