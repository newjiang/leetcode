package org.jiang.algorithm.sort;

public interface Sort {
    /**
     * 排序接口
     *
     * @param data 数据
     * @param <T>  类型
     */
    <T extends Comparable> void sort(T[] data);

    /**
     * 交换算法
     *
     * @param data   数据
     * @param source 来源
     * @param target 目标
     * @param <T> 类型
     */
    default <T> void swap(T[] data, int source, int target) {
        T temp = data[source];
        data[source] = data[target];
        data[target] = temp;
    }

}
