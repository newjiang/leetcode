package org.jiang.algorithm.sort;

/**
 * 插入排序
 */
public class InsertionSort implements Sort {

    @Override
    public <T extends Comparable> void sort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                int curNode = j; // 当前元素
                int preNode = j - 1; // 前一个元素
                if (data[curNode].compareTo(data[preNode]) < 0) {
                    swap(data, curNode, preNode);
                } else {
                    break;
                }
            }
        }
        /*
        // 简洁版
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j > 0 && data[j].compareTo(data[j - 1]) < 0; j--) {
                swap(data, j, j - 1);
            }
        }
        */
    }
}
