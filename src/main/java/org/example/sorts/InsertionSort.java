package org.example.sorts;

/**
 * <Insertion Sort>
 * 其實就是從後面一個往前檢查
 */
public class InsertionSort {

    public static void insertionSort(int [] a){
        for(int i=1;i<a.length-1;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;//while跑出來=值排序好
        }
        for(int aa:a){
            System.out.println(aa);
        }
    }
}
