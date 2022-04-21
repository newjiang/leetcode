package org.jiang.algorithm.sort;

/**
 * 插入排序优化，利用赋值平移代替swap操作
 */
public class InsertionSortOptimize extends InsertionSort {

    @Override
    public <T extends Comparable> void sort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            T temp = data[i];
            int j = i;
            for (; j > 0 && temp.compareTo(data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }
            data[j] = temp;
        }
    }
}
