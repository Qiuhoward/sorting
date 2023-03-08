package org.example.sorts;

/**
 * <Bubble sort>
 */
public class BubbleSort {


    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){

                if(a[j+1]>a[j]){
                    int temp;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int aa:a){
            System.out.println(aa);
        }
    }
}
