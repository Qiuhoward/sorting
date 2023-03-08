package org.example;

import static org.example.sorts.BubbleSort.bubbleSort;
import static org.example.sorts.InsertionSort.insertionSort;
import static org.example.sorts.MergeSort.mergeSort;
import static org.example.sorts.SelectionSort.selectionSort;

/**
 * Primary Sorts
 * <a href="https://www.youtube.com/watch?v=3j0SWDX4AtU&ab_channel=BroCode"></a>
 */
public class Main {
    public static void main(String[] args) {


        int[] a ={1,2,3,4,5,6,7,8,9};
        bubbleSort(a);
        selectionSort(a);
        insertionSort(a);
        mergeSort(a);
    }


}
