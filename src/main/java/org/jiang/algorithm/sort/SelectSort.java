package org.jiang.algorithm.sort;

/**
 * 选择排序
 */
public class SelectSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            // 查找当前下标中应存放最小的值
            for (int j = i; j < data.length; j++) {
                if (data[i].compareTo(data[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(data, i, minIndex);
        }
    }
}
