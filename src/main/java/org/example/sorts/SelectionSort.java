package org.example.sorts;

/**
 * <Selection Sort>
 *t 當前的索引複製到min min去跟後面數值比較 ，比較完開始移位
 */
public class SelectionSort {
    public static void selectionSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){ //所以跟泡沫相較而言這邊可以直接改'<' or '>' 變換大小排序方向
                    min=j;
                }
            }   //全部做完大小比較再進行排序
            int temp;
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;//放到找回最小值的index

        }

        for(int aa:a){
            System.out.println(aa);
        }
    }
}
